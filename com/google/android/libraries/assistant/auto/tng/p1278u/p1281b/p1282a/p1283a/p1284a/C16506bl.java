package com.google.android.libraries.assistant.auto.tng.p1278u.p1281b.p1282a.p1283a.p1284a;

import android.app.KeyguardManager;
import android.text.TextUtils;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12989g;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.assistant.p3897e.p3917i.p3918a.C51378fm;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.u.b.a.a.a.bl */
/* compiled from: PG */
public final class C16506bl extends C68247h {

    /* renamed from: a */
    private final C68283d f48477a;

    /* renamed from: c */
    private final C68283d f48478c;

    /* renamed from: d */
    private final C68283d f48479d;

    /* renamed from: e */
    private final C68283d f48480e;

    public C16506bl(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4) {
        super(aVar2, new C68277d(C16506bl.class), aVar);
        this.f48477a = C68236af.m98549d(dVar);
        this.f48478c = C68236af.m98549d(dVar2);
        this.f48479d = C68236af.m98549d(dVar3);
        this.f48480e = C68236af.m98549d(dVar4);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        Object obj2;
        List list = (List) obj;
        KeyguardManager keyguardManager = (KeyguardManager) list.get(1);
        String str = (String) list.get(2);
        boolean booleanValue = ((Boolean) list.get(3)).booleanValue();
        C12989g a = C12989g.m29225a(((C12991i) list.get(0)).f40385d);
        if (a == null) {
            a = C12989g.UNKNOWN;
        }
        if (a != C12989g.MORRIS) {
            obj2 = C58836b.f156633a;
        } else if (keyguardManager.isKeyguardLocked()) {
            obj2 = C58833ax.m90834k(C51378fm.LOCKSCREEN);
        } else if (TextUtils.isEmpty(str) || booleanValue) {
            obj2 = C58833ax.m90834k(C51378fm.HOMESCREEN);
        } else {
            obj2 = C58833ax.m90834k(C51378fm.IN_APP);
        }
        return C60856cj.m92900i(obj2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f48477a.mo60297gq(), this.f48478c.mo60297gq(), this.f48479d.mo60297gq(), this.f48480e.mo60297gq());
    }
}
