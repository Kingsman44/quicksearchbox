package com.google.android.apps.gsa.search.core.preferences.cards;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Toast;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.search.core.preferences.cards.d */
/* compiled from: PG */
final class C86306d implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ RelationshipSettingsFragment f233356a;

    public C86306d(RelationshipSettingsFragment relationshipSettingsFragment) {
        this.f233356a = relationshipSettingsFragment;
    }

    public final void onClick(View view) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://support.google.com/websearch?p=contact_relationships"));
        try {
            this.f233356a.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            C59104x c = RelationshipSettingsFragment.f233344a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "RelationshipSettingsFra");
            ((C59052c) ((C59052c) c).mo56372aa(8341)).mo56389s("No activity to handle intent: %s", intent);
            Toast.makeText(this.f233356a.getActivity(), R.string.no_url_handler, 0).show();
        }
    }
}
