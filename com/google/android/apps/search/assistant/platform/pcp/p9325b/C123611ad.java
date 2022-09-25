package com.google.android.apps.search.assistant.platform.pcp.p9325b;

import android.content.ContentValues;
import com.google.android.apps.search.assistant.platform.pcp.p9339i.C124055aj;
import com.google.android.apps.search.assistant.platform.pcp.p9339i.C124089bo;
import com.google.android.libraries.storage.p3315b.C42837aw;
import com.google.android.libraries.storage.p3315b.C42838ax;
import com.google.android.libraries.storage.p3315b.C42839ay;
import com.google.android.libraries.storage.p3315b.C42840az;
import com.google.assistant.p3803ag.p3809c.C48952az;
import com.google.assistant.p3994s.p3995a.C53128ck;
import com.google.assistant.p3994s.p3995a.C53131cn;
import com.google.assistant.p3994s.p3995a.C53132co;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.assistant.p3994s.p3995a.C53308jb;
import com.google.assistant.p3994s.p3995a.C53424nj;
import com.google.common.base.C58913w;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.protobuf.MessageLite;
import com.google.protos.p4816ai.p4818b.C63204j;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.b.ad */
/* compiled from: PG */
public final class C123611ad {

    /* renamed from: a */
    public static final C42839ay f341535a;

    /* renamed from: b */
    private static final C58974d f341536b = C58974d.m91136j();

    static {
        C42840az azVar = new C42840az();
        azVar.f112130a.append("SELECT * FROM GlobalData");
        azVar.f112130a.append(" WHERE row_id = 1");
        f341535a = azVar.mo45920a();
    }

    /* renamed from: a */
    public static ContentValues m202942a(C53306j jVar, int i, String str, boolean z, C53132co coVar, C48952az azVar, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("data_id", str);
        contentValues.put("data_type", Integer.valueOf(i));
        contentValues.put("client_type", Integer.valueOf(jVar.f139793X));
        contentValues.put("display_validity", Integer.valueOf(z ? 1 : 0));
        contentValues.put("last_update_timestamp", Long.valueOf(j));
        if (azVar != null) {
            contentValues.put("contextual_triggering_condition", azVar.toByteArray());
        }
        m202966y(contentValues, coVar);
        return contentValues;
    }

    /* renamed from: b */
    public static ContentValues m202943b(int i, String str, MessageLite messageLite, byte[] bArr, byte[] bArr2, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("data_id", str);
        contentValues.put("data_content", messageLite.toByteArray());
        contentValues.put("data_type", Integer.valueOf(i));
        contentValues.put("hash_tag", bArr);
        contentValues.put("token", bArr2);
        contentValues.put("last_update_timestamp", Long.valueOf(j));
        return contentValues;
    }

    /* renamed from: c */
    public static C42837aw m202944c(List list) {
        ListIterator listIterator = list.listIterator();
        C42838ax axVar = new C42838ax("ClientProactiveData");
        while (listIterator.hasNext()) {
            C124055aj ajVar = (C124055aj) listIterator.next();
            axVar.f112125a.append("(client_type = ?");
            axVar.f112126b.add(String.valueOf(ajVar.mo106259b().f139793X));
            axVar.f112125a.append(" AND data_type = ?");
            axVar.f112126b.add(String.valueOf(ajVar.mo106258a()));
            axVar.f112125a.append(" AND data_id = ?");
            axVar.f112126b.add(ajVar.mo106260c());
            axVar.f112125a.append(")");
            if (listIterator.hasNext()) {
                axVar.f112125a.append(" OR ");
            }
        }
        return axVar.mo45919a();
    }

    /* renamed from: d */
    public static C42837aw m202945d(String str, Map map) {
        Iterator it = map.entrySet().iterator();
        C42838ax axVar = new C42838ax(str);
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            axVar.f112125a.append("(data_type = ?");
            axVar.f112126b.add(String.valueOf(entry.getKey()));
            axVar.f112125a.append(" AND data_id IN (?");
            List list = (List) entry.getValue();
            if (!list.isEmpty()) {
                axVar.f112126b.add((String) list.get(0));
            }
            for (int i = 1; i < list.size(); i++) {
                axVar.f112125a.append(", ?");
                axVar.f112126b.add((String) list.get(i));
            }
            axVar.f112125a.append("))");
            if (it.hasNext()) {
                axVar.f112125a.append(" OR ");
            }
        }
        return axVar.mo45919a();
    }

    /* renamed from: e */
    static C42839ay m202946e() {
        C42840az azVar = new C42840az();
        azVar.f112130a.append("SELECT data_type");
        azVar.f112130a.append(", data_id");
        azVar.f112130a.append(", client_type");
        azVar.f112130a.append(", display_validity");
        azVar.f112130a.append(", data_content_hash");
        azVar.f112130a.append(", last_update_timestamp");
        azVar.f112130a.append(", contextual_triggering_condition");
        azVar.f112130a.append(", dismissal_expiration_timestamp");
        azVar.f112130a.append(" FROM ClientProactiveData");
        return azVar.mo45920a();
    }

    /* renamed from: f */
    static C42839ay m202947f() {
        C42840az azVar = new C42840az();
        azVar.f112130a.append("SELECT GlobalData.next_alarm_trigger_time");
        azVar.f112130a.append(" FROM GlobalData");
        return azVar.mo45920a();
    }

    /* renamed from: g */
    static C42839ay m202948g() {
        C42840az azVar = new C42840az();
        azVar.f112130a.append("SELECT data_type");
        azVar.f112130a.append(", data_id");
        azVar.f112130a.append(", client_type");
        azVar.f112130a.append(", last_query_timestamp");
        azVar.f112130a.append(", query_time");
        azVar.f112130a.append(", data_hash");
        azVar.f112130a.append(" FROM LastClientDataQuery");
        return azVar.mo45920a();
    }

    /* renamed from: h */
    static C42839ay m202949h() {
        C42840az azVar = new C42840az();
        azVar.f112130a.append("SELECT data_type");
        azVar.f112130a.append(", data_id");
        azVar.f112130a.append(", hash_tag");
        azVar.f112130a.append(", data_content");
        azVar.f112130a.append(", last_update_timestamp");
        azVar.f112130a.append(" FROM SharedProactiveData");
        return azVar.mo45920a();
    }

    /* renamed from: i */
    static C42839ay m202950i() {
        C42840az azVar = new C42840az();
        azVar.f112130a.append("SELECT data_content FROM SharedProactiveData WHERE data_type = ?");
        azVar.f112131b.add(100003L);
        return azVar.mo45920a();
    }

    /* renamed from: j */
    static C42839ay m202951j(List list, List list2, C53306j jVar, boolean z) {
        C42840az azVar = new C42840az();
        azVar.f112130a.append("SELECT data_type AS CLIENT_DATA_TYPE");
        azVar.f112130a.append(", data_id AS CLIENT_DATA_ID");
        azVar.f112130a.append(", ve_id");
        azVar.f112130a.append(", impression_repression");
        azVar.f112130a.append(", eucd_metadata");
        azVar.f112130a.append(", impressions_limit");
        azVar.f112130a.append(", as_target_deep_link_id");
        azVar.f112130a.append(", rendered_element");
        azVar.f112130a.append(", like_question_configuration");
        azVar.f112130a.append(", feature_tree_ref");
        azVar.f112130a.append(", data_content_hash");
        azVar.f112130a.append(", input_suggestion");
        azVar.f112130a.append(", last_update_timestamp");
        azVar.f112130a.append(", filtering_context_conditions");
        azVar.f112130a.append(" FROM ClientProactiveData");
        azVar.f112130a.append(" WHERE (client_type = ?");
        azVar.f112131b.add(Long.valueOf((long) jVar.f139793X));
        if (z) {
            azVar.f112130a.append(" AND display_validity = 1)");
        } else {
            azVar.f112130a.append(")");
        }
        m202965x(azVar, list2);
        m202964w(azVar, list);
        return azVar.mo45920a();
    }

    /* renamed from: k */
    static C42839ay m202952k(List list, List list2, C53306j jVar) {
        C42840az azVar = new C42840az();
        azVar.f112130a.append("SELECT data_content, SharedProactiveData.data_type AS SHARED_DATA_TYPE, SharedProactiveData.data_id AS SHARED_DATA_ID, hash_tag, ClientProactiveData.data_type AS CLIENT_DATA_TYPE, ClientProactiveData.data_id AS CLIENT_DATA_ID, ve_id, impression_repression, eucd_metadata, as_target_deep_link_id, rendered_element, like_question_configuration, feature_tree_ref, data_content_hash, input_suggestion, ClientProactiveData.last_update_timestamp, filtering_context_conditions FROM SharedProactiveData LEFT JOIN ClientProactiveData ON (SHARED_DATA_ID = CLIENT_DATA_ID AND SHARED_DATA_TYPE = CLIENT_DATA_TYPE) WHERE ((ClientProactiveData.client_type = ? AND display_validity = 1) OR ClientProactiveData.data_id IS NULL)");
        azVar.f112131b.add(Long.valueOf((long) jVar.f139793X));
        if (!list2.isEmpty()) {
            azVar.f112130a.append(" AND SHARED_DATA_TYPE IN(?");
            azVar.f112131b.add(Long.valueOf((long) ((Integer) list2.get(0)).intValue()));
            for (int i = 1; i < list2.size(); i++) {
                azVar.f112130a.append(", ?");
                azVar.f112131b.add(Long.valueOf((long) ((Integer) list2.get(i)).intValue()));
            }
            azVar.f112130a.append(")");
        }
        if (!list.isEmpty()) {
            azVar.f112130a.append(" AND SHARED_DATA_ID IN(?");
            azVar.f112131b.add((String) list.get(0));
            for (int i2 = 1; i2 < list.size(); i2++) {
                azVar.f112130a.append(", ?");
                azVar.f112131b.add((String) list.get(i2));
            }
            azVar.f112130a.append(")");
        }
        azVar.f112130a.append(" UNION ");
        azVar.f112130a.append("SELECT data_content, SharedProactiveData.data_type AS SHARED_DATA_TYPE, SharedProactiveData.data_id AS SHARED_DATA_ID, hash_tag, ClientProactiveData.data_type AS CLIENT_DATA_TYPE, ClientProactiveData.data_id AS CLIENT_DATA_ID, ve_id, impression_repression, eucd_metadata, as_target_deep_link_id, rendered_element, like_question_configuration, feature_tree_ref, data_content_hash, input_suggestion, ClientProactiveData.last_update_timestamp, filtering_context_conditions FROM ClientProactiveData LEFT JOIN SharedProactiveData ON (SHARED_DATA_ID = CLIENT_DATA_ID AND SHARED_DATA_TYPE = CLIENT_DATA_TYPE) WHERE (ClientProactiveData.client_type = ? AND display_validity = 1)");
        azVar.f112131b.add(Long.valueOf((long) jVar.f139793X));
        m202965x(azVar, list2);
        m202964w(azVar, list);
        azVar.f112130a.append(" AND SHARED_DATA_ID IS NULL");
        return azVar.mo45920a();
    }

    /* renamed from: l */
    public static C42839ay m202953l(List list, C53306j jVar) {
        C42840az azVar = new C42840az();
        azVar.f112130a.append("SELECT data_content, SharedProactiveData.data_type AS SHARED_DATA_TYPE, SharedProactiveData.data_id AS SHARED_DATA_ID, hash_tag, ClientProactiveData.data_type AS CLIENT_DATA_TYPE, ClientProactiveData.data_id AS CLIENT_DATA_ID, ve_id, impression_repression, eucd_metadata, as_target_deep_link_id, rendered_element, like_question_configuration, feature_tree_ref, data_content_hash, input_suggestion, ClientProactiveData.last_update_timestamp, filtering_context_conditions FROM ClientProactiveData LEFT JOIN SharedProactiveData ON (SHARED_DATA_ID = CLIENT_DATA_ID AND SHARED_DATA_TYPE = CLIENT_DATA_TYPE) WHERE (ClientProactiveData.client_type = ? ");
        azVar.f112131b.add(Long.valueOf((long) jVar.f139793X));
        m202965x(azVar, list);
        azVar.f112130a.append(")");
        return azVar.mo45920a();
    }

    /* renamed from: m */
    static C42839ay m202954m(C53306j jVar, int i, String str) {
        C42840az azVar = new C42840az();
        azVar.f112130a.append("SELECT contextual_triggering_condition FROM ClientProactiveData WHERE ");
        azVar.f112130a.append("client_type = ?");
        azVar.f112131b.add(Long.valueOf((long) jVar.f139793X));
        azVar.f112130a.append(" AND data_type = ?");
        azVar.f112131b.add(Long.valueOf((long) C124089bo.m203513a(Integer.valueOf(i)).intValue()));
        azVar.f112130a.append(" AND data_id = ?");
        azVar.f112131b.add(str);
        return azVar.mo45920a();
    }

    /* renamed from: n */
    static C42840az m202955n(int i) {
        C42840az azVar = new C42840az();
        azVar.f112130a.append("SELECT data_id");
        azVar.f112130a.append(", hash_tag");
        azVar.f112130a.append(" FROM SharedProactiveData");
        azVar.f112130a.append(" WHERE data_type = ?");
        azVar.f112131b.add(Long.valueOf((long) i));
        return azVar;
    }

    /* renamed from: o */
    static C42840az m202956o(C53306j jVar) {
        C42840az azVar = new C42840az();
        azVar.f112130a.append("SELECT LastClientDataQuery.data_type");
        azVar.f112130a.append(", LastClientDataQuery.data_id");
        azVar.f112130a.append(", LastClientDataQuery.data_hash");
        azVar.f112130a.append(" FROM LastClientDataQuery");
        azVar.f112130a.append(" WHERE client_type = ?");
        azVar.f112131b.add(Long.valueOf((long) jVar.f139793X));
        return azVar;
    }

    /* renamed from: p */
    static C42840az m202957p(Instant instant) {
        C42840az azVar = new C42840az();
        azVar.f112130a.append("INSERT OR REPLACE INTO GlobalData");
        azVar.f112130a.append(" (row_id, calendar_recon_start_time, next_alarm_trigger_time) ");
        azVar.f112130a.append("VALUES(1, ?, ");
        azVar.f112131b.add(Long.valueOf(instant.toEpochMilli()));
        azVar.f112130a.append("COALESCE((SELECT next_alarm_trigger_time FROM GlobalData WHERE row_id =?), 0))");
        azVar.f112131b.add(1L);
        return azVar;
    }

    /* renamed from: q */
    static C42840az m202958q(C53306j jVar, int i, String str, C48952az azVar, long j) {
        C42840az azVar2 = new C42840az();
        azVar2.f112130a.append("UPDATE ClientProactiveData");
        azVar2.f112130a.append(" SET contextual_triggering_condition = ?");
        azVar2.f112131b.add(azVar.toByteArray());
        azVar2.f112130a.append(",");
        azVar2.f112130a.append("last_click_timestamp = ?");
        azVar2.f112131b.add(Long.valueOf(j));
        azVar2.f112130a.append(" WHERE client_type = ?");
        azVar2.f112131b.add(Long.valueOf((long) jVar.f139793X));
        azVar2.f112130a.append(" AND data_type = ?");
        azVar2.f112131b.add(Long.valueOf((long) C124089bo.m203513a(Integer.valueOf(i)).intValue()));
        azVar2.f112130a.append(" AND data_id = ?");
        azVar2.f112131b.add(str);
        return azVar2;
    }

    /* renamed from: r */
    static C42840az m202959r(C53306j jVar, int i, String str, long j, long j2) {
        C42840az azVar = new C42840az();
        azVar.f112130a.append("UPDATE ClientProactiveData");
        azVar.f112130a.append(" SET dismissal_expiration_timestamp = ?");
        azVar.f112131b.add(Long.valueOf(j));
        azVar.f112130a.append(",");
        azVar.f112130a.append("last_click_timestamp = ?");
        azVar.f112131b.add(Long.valueOf(j2));
        azVar.f112130a.append(" WHERE client_type = ?");
        azVar.f112131b.add(Long.valueOf((long) jVar.f139793X));
        azVar.f112130a.append(" AND data_type = ?");
        azVar.f112131b.add(Long.valueOf((long) C124089bo.m203513a(Integer.valueOf(i)).intValue()));
        azVar.f112130a.append(" AND data_id = ?");
        azVar.f112131b.add(str);
        return azVar;
    }

    /* renamed from: s */
    static C42840az m202960s(C53306j jVar, int i, String str, boolean z) {
        C42840az azVar = new C42840az();
        azVar.f112130a.append("UPDATE ClientProactiveData");
        azVar.f112130a.append(" SET display_validity = ?");
        azVar.f112131b.add(true != z ? "0" : "1");
        azVar.f112130a.append(" WHERE client_type = ?");
        azVar.f112131b.add(Long.valueOf((long) jVar.f139793X));
        azVar.f112130a.append(" AND data_type = ?");
        azVar.f112131b.add(Long.valueOf((long) i));
        azVar.f112130a.append(" AND data_id = ?");
        azVar.f112131b.add(str);
        return azVar;
    }

    /* renamed from: t */
    public static C42840az m202961t(Instant instant) {
        C42840az azVar = new C42840az();
        azVar.f112130a.append("INSERT OR REPLACE INTO GlobalData");
        azVar.f112130a.append(" (row_id, next_alarm_trigger_time, calendar_recon_start_time) ");
        azVar.f112130a.append("VALUES(1, ?, ");
        azVar.f112131b.add(Long.valueOf(instant.toEpochMilli()));
        azVar.f112130a.append("COALESCE((SELECT calendar_recon_start_time FROM GlobalData WHERE row_id =?), 0))");
        azVar.f112131b.add(1L);
        return azVar;
    }

    /* renamed from: u */
    public static ContentValues m202962u(C53132co coVar, C48952az azVar, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("last_update_timestamp", Long.valueOf(j));
        if (azVar != null) {
            contentValues.put("filtering_context_conditions", azVar.toByteArray());
        }
        m202966y(contentValues, coVar);
        return contentValues;
    }

    /* renamed from: v */
    public static ContentValues m202963v(C53132co coVar, C48952az azVar, long j, C53306j jVar, int i, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("data_id", str);
        contentValues.put("data_type", Integer.valueOf(i));
        contentValues.put("client_type", Integer.valueOf(jVar.f139793X));
        contentValues.put("display_validity", 1);
        contentValues.put("last_update_timestamp", Long.valueOf(j));
        if (azVar != null) {
            contentValues.put("filtering_context_conditions", azVar.toByteArray());
        }
        m202966y(contentValues, coVar);
        return contentValues;
    }

    /* renamed from: w */
    private static void m202964w(C42840az azVar, List list) {
        if (!list.isEmpty()) {
            azVar.f112130a.append(" AND CLIENT_DATA_ID IN(?");
            azVar.f112131b.add((String) list.get(0));
            for (int i = 1; i < list.size(); i++) {
                azVar.f112130a.append(", ?");
                azVar.f112131b.add((String) list.get(i));
            }
            azVar.f112130a.append(")");
        }
    }

    /* renamed from: x */
    private static void m202965x(C42840az azVar, List list) {
        if (!list.isEmpty()) {
            azVar.f112130a.append(" AND CLIENT_DATA_TYPE IN(?");
            azVar.f112131b.add(Long.valueOf((long) ((Integer) list.get(0)).intValue()));
            for (int i = 1; i < list.size(); i++) {
                azVar.f112130a.append(", ?");
                azVar.f112131b.add(Long.valueOf((long) ((Integer) list.get(i)).intValue()));
            }
            azVar.f112130a.append(")");
        }
    }

    /* renamed from: y */
    private static void m202966y(ContentValues contentValues, C53132co coVar) {
        if (coVar != null) {
            if ((coVar.f139252a & 512) != 0) {
                C53308jb jbVar = coVar.f139260i;
                if (jbVar == null) {
                    jbVar = C53308jb.f139794f;
                }
                if ((jbVar.f139796a & 4) != 0) {
                    contentValues.put("ve_id", Integer.valueOf(jbVar.f139799d));
                }
                if ((jbVar.f139796a & 2) != 0) {
                    contentValues.put("impression_repression", Integer.valueOf(true != jbVar.f139798c ? 1 : 2));
                }
                if ((jbVar.f139796a & 1) != 0) {
                    C63204j jVar = jbVar.f139797b;
                    if (jVar == null) {
                        jVar = C63204j.f170749e;
                    }
                    contentValues.put("feature_tree_ref", jVar.toByteArray());
                }
            }
            if ((coVar.f139252a & 2) != 0) {
                C53424nj njVar = coVar.f139254c;
                if (njVar == null) {
                    njVar = C53424nj.f140199d;
                }
                contentValues.put("eucd_metadata", njVar.toByteArray());
            }
            if ((coVar.f139252a & 32) != 0) {
                contentValues.put("impressions_limit", Integer.valueOf(coVar.f139256e));
            }
            if ((coVar.f139252a & 64) != 0) {
                contentValues.put("as_target_deep_link_id", coVar.f139257f);
            }
            if ((coVar.f139252a & 128) != 0) {
                contentValues.put("rendered_element", coVar.f139258g.mo59174N());
            }
            if ((coVar.f139252a & 256) != 0) {
                C53131cn cnVar = coVar.f139259h;
                if (cnVar == null) {
                    cnVar = C53131cn.f139246c;
                }
                contentValues.put("like_question_configuration", cnVar.toByteArray());
            }
            if ((coVar.f139252a & 2048) != 0) {
                contentValues.put("data_content_hash", coVar.f139262k.getBytes(C58913w.f156754c));
            } else {
                ((C58970a) ((C58970a) f341536b.mo56226d()).mo56372aa(35184)).mo56386p("RenderingInstructions does not contain a Tag and will not be readable.");
            }
            if ((coVar.f139252a & 1024) != 0) {
                C53128ck ckVar = coVar.f139261j;
                if (ckVar == null) {
                    ckVar = C53128ck.f139238f;
                }
                contentValues.put("input_suggestion", ckVar.toByteArray());
            }
            if ((coVar.f139252a & 16) != 0) {
                C48952az azVar = coVar.f139255d;
                if (azVar == null) {
                    azVar = C48952az.f126657c;
                }
                contentValues.put("filtering_context_conditions", azVar.toByteArray());
            }
        }
    }
}
