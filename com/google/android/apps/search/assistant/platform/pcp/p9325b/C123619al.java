package com.google.android.apps.search.assistant.platform.pcp.p9325b;

import com.google.android.libraries.storage.p3315b.C42834at;
import com.google.android.libraries.storage.p3315b.C42847bf;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.b.al */
/* compiled from: PG */
public final /* synthetic */ class C123619al implements C42834at {

    /* renamed from: a */
    public static final /* synthetic */ C123619al f341545a = new C123619al();

    private /* synthetic */ C123619al() {
    }

    /* renamed from: a */
    public final void mo45917a(C42847bf bfVar) {
        bfVar.mo45935i("INSERT INTO ClientProactiveData(data_type, data_id, client_type, display_validity, ve_id, impression_repression, eucd_metadata, impressions_limit, as_target_deep_link_id, rendered_element, like_question_configuration, feature_tree_ref, data_content_hash, contextual_triggering_condition, last_update_timestamp, impression_count, click_count, last_impression_timestamp, last_click_timestamp) SELECT data_type, data_id, client_type, display_validity, ve_id, impression_repression, eucd_metadata, impressions_limit, as_target_deep_link_id, rendered_element, like_question_configuration, feature_tree_ref, rendered_card_hash, contextual_triggering_condition, last_update_timestamp, impression_count, click_count, last_impression_timestamp, last_click_timestamp FROM tmp_ClientProactiveData");
    }
}
