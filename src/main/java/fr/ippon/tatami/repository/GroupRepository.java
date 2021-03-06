package fr.ippon.tatami.repository;

import fr.ippon.tatami.domain.Group;

/**
 * The Group Repository.
 *
 * @author Julien Dubois
 */
public interface GroupRepository {

    String createGroup(String domain, String groupName);

    Group getGroupById(String domain, String groupId);
}
