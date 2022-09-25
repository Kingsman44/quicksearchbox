package com.google.android.apps.gsa.staticplugins.p7653ch;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.gsa.search.core.C85651bb;
import com.google.android.apps.gsa.search.core.service.C86649bp;
import com.google.android.apps.gsa.search.shared.service.StartActivityForResultEventCompoundParcelable;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88158rh;
import com.google.android.apps.gsa.shared.search.C90507o;
import com.google.android.apps.gsa.sidekick.shared.p7241j.C91750f;
import com.google.android.apps.gsa.sidekick.shared.util.C91973ax;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.p375ai.p378b.C7891nu;

/* renamed from: com.google.android.apps.gsa.staticplugins.ch.j */
/* compiled from: PG */
public final /* synthetic */ class C97640j implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C97641k f272700a;

    /* renamed from: b */
    public final /* synthetic */ C88158rh f272701b;

    /* renamed from: c */
    public final /* synthetic */ String f272702c;

    /* renamed from: d */
    public final /* synthetic */ int f272703d;

    public /* synthetic */ C97640j(C97641k kVar, C88158rh rhVar, String str, int i) {
        this.f272700a = kVar;
        this.f272701b = rhVar;
        this.f272702c = str;
        this.f272703d = i;
    }

    public final void run() {
        C97641k kVar = this.f272700a;
        C88158rh rhVar = this.f272701b;
        String str = this.f272702c;
        int i = this.f272703d;
        C85651bb bbVar = (C85651bb) kVar.f272710g.mo27525b();
        if (!C91750f.m150309b(bbVar.f231493d, bbVar.f231491b.getLong(C90507o.f253029s, 0))) {
            C7891nu a = C7891nu.m22887a(rhVar.f238321b);
            if (a == null) {
                a = C7891nu.UNKNOWN_OPT_IN_SOURCE;
            }
            C91973ax axVar = new C91973ax(a);
            axVar.f256474f = false;
            axVar.f256469a = str;
            if (((C85651bb) kVar.f272710g.mo27525b()).mo79138K()) {
                axVar.f256475g = 2;
            }
            Intent a2 = axVar.mo86664a();
            Bundle bundle = new Bundle();
            bundle.putInt("opt_in_mode", a2.getIntExtra("opt_in_mode", 5));
            if (rhVar.f238322c) {
                bundle.putBoolean("close-activity-on-full-cancel", true);
            }
            ((C86649bp) kVar.f272706a.mo27525b()).mo80262a(i, 1, new StartActivityForResultEventCompoundParcelable(a2, bundle));
        }
    }
}
