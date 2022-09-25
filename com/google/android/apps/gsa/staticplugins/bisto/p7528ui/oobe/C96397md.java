package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import com.google.android.apps.gsa.opaonboarding.C83870ad;
import com.google.android.apps.gsa.opaonboarding.C83875ai;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84026u;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.shared.bisto.p7029b.C89635f;
import com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b.C124528i;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60922j;
import dagger.C68214a;
import java.util.concurrent.Executor;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.md */
/* compiled from: PG */
public final class C96397md extends C83870ad {

    /* renamed from: a */
    public final String f269683a;

    /* renamed from: b */
    public final C124528i f269684b;

    /* renamed from: c */
    public final C89635f f269685c;

    /* renamed from: d */
    public final Executor f269686d;

    /* renamed from: e */
    public int f269687e = 1;

    /* renamed from: f */
    private final C68214a f269688f;

    /* renamed from: g */
    private final C84026u f269689g;

    /* renamed from: h */
    private final C69464a f269690h;

    public C96397md(C96094ay ayVar, C68214a aVar, C124528i iVar, C89635f fVar, C84026u uVar, C69464a aVar2, Executor executor) {
        this.f269688f = aVar;
        this.f269684b = iVar;
        this.f269685c = fVar;
        String str = ayVar.f269039a;
        str.getClass();
        this.f269683a = str;
        this.f269689g = uVar;
        this.f269690h = aVar2;
        this.f269686d = executor;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C58833ax mo77210d() {
        int i = this.f269687e;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 1) {
            this.f269687e = 4;
            return C58833ax.m90834k(C83875ai.m133537b(new C96399mf()));
        } else if (i2 == 2) {
            this.f269687e = 1;
            return C58833ax.m90834k(C83875ai.m133537b(new C96304is()));
        } else if (i2 != 3) {
            return C58833ax.m90834k(this.f269689g.mo77487a(C60922j.m93045h(C60838bs.m92859i(((C89492cd) this.f269688f.mo27525b()).mo83408n(this.f269683a)), new C96396mc(this), this.f269686d), this.f269690h));
        } else {
            return C58836b.f156633a;
        }
    }
}
