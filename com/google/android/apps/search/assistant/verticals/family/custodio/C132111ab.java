package com.google.android.apps.search.assistant.verticals.family.custodio;

import android.os.Bundle;
import android.support.p033v7.view.menu.C0480t;
import android.support.p033v7.widget.C0631et;
import android.view.MenuItem;
import com.google.android.apps.search.assistant.verticals.family.custodio.C132363y;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.tracing.C47538ax;
import com.google.p427am.p432b.p433a.C8649ba;
import com.google.p427am.p432b.p433a.C8675e;

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.ab */
/* compiled from: PG */
public final /* synthetic */ class C132111ab implements C0631et {

    /* renamed from: a */
    public final /* synthetic */ C132363y.C132365a f360625a;

    /* renamed from: b */
    public final /* synthetic */ C8649ba f360626b;

    /* renamed from: c */
    public final /* synthetic */ C8675e f360627c;

    public /* synthetic */ C132111ab(C132363y.C132365a aVar, C8649ba baVar, C8675e eVar) {
        this.f360625a = aVar;
        this.f360626b = baVar;
        this.f360627c = eVar;
    }

    /* renamed from: a */
    public final boolean mo2855a(MenuItem menuItem) {
        C132363y.C132365a aVar = this.f360625a;
        C8649ba baVar = this.f360626b;
        C8675e eVar = this.f360627c;
        boolean z = false;
        if (((C0480t) menuItem).f1682a == R.id.assistant_custodio_device_list_menu_unlink_device) {
            Bundle a = C132361w.m215129a(C132363y.this.f361309c);
            a.putString("device_id", baVar.f29935b);
            a.putString("device_name", baVar.f29937d);
            a.putBoolean("is_SLA_flow", false);
            C132363y.this.f361308b.requireActivity().mo545jw().mo450Q("UNLINKING_DIALOG_FRAGMENT_LISTENER_REQUEST_KEY", C132363y.this.f361308b, new C132116ag(aVar, eVar));
            C47538ax c = C132363y.this.f361314h.mo51613c("assistant_custodio_device_list_menu_unlink_device");
            try {
                C132363y yVar = C132363y.this;
                yVar.f361313g.mo50482c(yVar.f361308b).mo50508d(R.id.assistant_custodio_device_list_fragment_to_unlinking_dialog, a);
                z = true;
                if (c != null) {
                    c.close();
                    return true;
                }
            } catch (Throwable th) {
                C132110aa.m214749a(th, th);
            }
        }
        return z;
        throw th;
    }
}
