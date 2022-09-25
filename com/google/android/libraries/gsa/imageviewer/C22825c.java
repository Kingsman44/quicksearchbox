package com.google.android.libraries.gsa.imageviewer;

import android.content.ComponentName;
import android.content.Intent;
import com.google.android.libraries.p1646ay.C19601c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.C60321oe;

/* renamed from: com.google.android.libraries.gsa.imageviewer.c */
/* compiled from: PG */
public final class C22825c {

    /* renamed from: a */
    private static final C59071e f62857a = C59071e.m91332i("com.google.android.libraries.gsa.imageviewer.c");

    /* renamed from: a */
    public static Intent m42662a(C22828f fVar) {
        try {
            boolean z = true;
            Intent a = C19601c.m37394a("ImageViewerActivity", new Intent(), new ComponentName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.velour.dynamichosts.VelvetDynamicHostActivity"), true);
            if (fVar.mo28181i() != null) {
                a.putExtra("query", fVar.mo28181i());
            }
            a.putExtra("selected_index", fVar.mo28171a());
            a.putExtra("fetch_more_images", fVar.mo28185m() && !fVar.mo28187o());
            if (!fVar.mo28188p() || fVar.mo28187o()) {
                z = false;
            }
            a.putExtra("show_rich_content", z);
            a.putExtra("ipa", fVar.mo28186n());
            a.putExtra("presentation_mode", fVar.mo28187o());
            if (!(fVar.mo28174d() == null || fVar.mo28177f() == null || fVar.mo28175e() == null)) {
                a.putExtra("conversation_id_key", fVar.mo28174d());
                a.putExtra("conversation_title_key", fVar.mo28177f());
                a.putExtra("conversation_package_name_key", fVar.mo28175e());
            }
            if (!(fVar.mo28182j() == null || fVar.mo28183k() == null)) {
                a.putExtra("result_ved_key", fVar.mo28182j());
                a.putExtra("search_event_id_key", fVar.mo28183k());
            }
            C60321oe b = fVar.mo28172b();
            if (b != null) {
                a.putExtra("parent_event_key", b.toByteArray());
            }
            a.putExtra("metadata", fVar.mo28173c().toByteArray());
            return a;
        } catch (Exception e) {
            ((C59052c) ((C59052c) ((C59052c) f62857a.mo56225c()).mo56382g(e)).mo56372aa(48426)).mo56386p("Unable to create intent");
            return null;
        }
    }
}
