package com.google.android.apps.gsa.staticplugins.nga.p8092ui.p8095b;

import android.os.Build;
import com.google.android.apps.gsa.nga.shared.p6369ui.p6370a.C81517a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90040cs;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.ui.b.a */
/* compiled from: PG */
public final class C104149a {

    /* renamed from: a */
    private static final C59071e f289704a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.nga.ui.b.a");

    /* renamed from: b */
    private final C68214a f289705b;

    /* renamed from: c */
    private final C81517a f289706c;

    public C104149a(C68214a aVar, C81517a aVar2) {
        this.f289705b = aVar;
        this.f289706c = aVar2;
    }

    /* renamed from: d */
    private final int m172120d() {
        return ((C86124t) this.f289705b.mo27525b()).mo79746e(C90040cs.f248665d) ? 3 : 2;
    }

    /* renamed from: a */
    public final boolean mo93970a() {
        return mo93972c() == 3;
    }

    /* renamed from: b */
    public final boolean mo93971b() {
        return mo93972c() + -1 != 0;
    }

    /* renamed from: c */
    public final int mo93972c() {
        int b = this.f289706c.mo75125b();
        if (b == 0) {
            throw null;
        } else if (b == 2) {
            ((C59052c) ((C59052c) f289704a.mo56224b()).mo56372aa(21832)).mo56386p("AssistLayer is using the Material Beacon theme.");
            return 3;
        } else if (Build.VERSION.SDK_INT >= 33 && ((C86124t) this.f289705b.mo27525b()).mo79746e(C90040cs.f248666e)) {
            return 3;
        } else {
            if (Build.VERSION.SDK_INT >= 31) {
                return m172120d();
            }
            if (((C86124t) this.f289705b.mo27525b()).mo79746e(C90040cs.f248676o)) {
                return m172120d();
            }
            return 1;
        }
    }
}
