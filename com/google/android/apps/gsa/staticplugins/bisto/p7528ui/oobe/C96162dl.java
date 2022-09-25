package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.content.Context;
import com.google.android.apps.gsa.opaonboarding.C83870ad;
import com.google.android.apps.gsa.opaonboarding.C83875ai;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84026u;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89496ch;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90122ft;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95299e;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59071e;
import com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4784c.p4785a.p4786a.p4787a.C63138d;
import dagger.C68214a;
import java.util.concurrent.Executor;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.dl */
/* compiled from: PG */
public final class C96162dl extends C83870ad {

    /* renamed from: a */
    public static final C59071e f269185a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.dl");

    /* renamed from: b */
    public final Context f269186b;

    /* renamed from: c */
    public final C68214a f269187c;

    /* renamed from: d */
    public final C95299e f269188d;

    /* renamed from: e */
    public final String f269189e;

    /* renamed from: f */
    public final Executor f269190f;

    /* renamed from: g */
    public final C68214a f269191g;

    /* renamed from: h */
    public final boolean f269192h;

    /* renamed from: i */
    public final C68214a f269193i;

    /* renamed from: j */
    public final C68214a f269194j;

    /* renamed from: k */
    public final long f269195k;

    /* renamed from: l */
    public C63138d f269196l;

    /* renamed from: m */
    public boolean f269197m = false;

    /* renamed from: n */
    public boolean f269198n = false;

    /* renamed from: o */
    private final C22871g f269199o;

    /* renamed from: p */
    private final C84026u f269200p;

    /* renamed from: q */
    private final C69464a f269201q;

    public C96162dl(Context context, C68214a aVar, C95299e eVar, C96094ay ayVar, C22871g gVar, Executor executor, C84026u uVar, C68214a aVar2, C69464a aVar3, boolean z, C68214a aVar4, C68214a aVar5, C63138d dVar, C90021c cVar) {
        this.f269186b = context;
        this.f269187c = aVar;
        this.f269188d = eVar;
        String str = ayVar.f269039a;
        str.getClass();
        this.f269189e = str;
        this.f269199o = gVar;
        this.f269190f = executor;
        this.f269200p = uVar;
        this.f269201q = aVar3;
        this.f269192h = z;
        this.f269193i = aVar4;
        this.f269194j = aVar5;
        this.f269195k = cVar.mo79743a(C90122ft.f250875n);
        this.f269191g = aVar2;
        if (dVar != null) {
            this.f269196l = dVar;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C58833ax mo77210d() {
        if (this.f269198n) {
            return C58836b.f156633a;
        }
        if (this.f269197m) {
            this.f269197m = false;
            return C58833ax.m90834k(C83875ai.m133540e(new C96226fv(), C96226fv.m159529h("EnableDeviceFailed", R.string.assistant_bisto_oobe_error_enable_opa)));
        }
        return C58833ax.m90834k(this.f269200p.mo77487a(this.f269199o.mo28205e(this.f269199o.mo28209i(this.f269199o.mo28210j(((C89496ch) this.f269187c.mo27525b()).mo83408n(this.f269189e), "enable-opa", new C96157dg(this)), "record-success", new C96158dh(this)), "retry", Exception.class, new C96159di(this)), this.f269201q));
    }
}
