package com.google.android.apps.gsa.staticplugins.opa.zerostate.sections;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114870dm;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58833ax;
import com.google.common.base.C58881cr;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.bk */
/* compiled from: PG */
public final /* synthetic */ class C115007bk implements C58881cr {

    /* renamed from: a */
    public final /* synthetic */ C115009bm f319207a;

    public /* synthetic */ C115007bk(C115009bm bmVar) {
        this.f319207a = bmVar;
    }

    /* renamed from: a */
    public final Object mo6453a() {
        C115009bm bmVar = this.f319207a;
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(bmVar.f319210a).inflate(R.layout.zero_state_setting_view_dm, (ViewGroup) null);
        Intent putExtra = new Intent("com.google.android.googlequicksearchbox.action.ASSISTANT_SETTINGS").setPackage("com.google.android.googlequicksearchbox").putExtra("assistant_settings_feature", "poncho").putExtra("extra_assistant_settings_entry_source", "android_settings");
        String str = bmVar.f319214e;
        if (str != null) {
            putExtra.putExtra("assistant_device_id", str);
        }
        linearLayout.getClass();
        View findViewById = linearLayout.findViewById(R.id.zero_state_dm_setting_action);
        Activity activity = bmVar.f319211b;
        C58833ax axVar = bmVar.f319213d;
        C91097g gVar = bmVar.f319212c;
        findViewById.setOnClickListener(new C89943l(new C114870dm(activity, axVar, new C115008bl(gVar, putExtra), gVar)));
        return linearLayout;
    }
}
