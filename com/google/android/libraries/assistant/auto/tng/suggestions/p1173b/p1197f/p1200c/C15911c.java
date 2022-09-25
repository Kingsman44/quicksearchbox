package com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1197f.p1200c;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p741e.p742a.C12110b;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16384t;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16385u;
import com.google.assistant.p3897e.p3917i.p3918a.C51452if;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.Iterator;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.b.f.c.c */
/* compiled from: PG */
public final class C15911c extends C68247h {

    /* renamed from: a */
    private final C68283d f47238a;

    /* renamed from: c */
    private final C69464a f47239c;

    /* renamed from: d */
    private final C68283d f47240d;

    public C15911c(C69464a aVar, C69464a aVar2, C68283d dVar, C69464a aVar3, C68283d dVar2) {
        super(aVar2, new C68277d(C15911c.class), aVar);
        this.f47238a = C68236af.m98549d(dVar);
        this.f47239c = aVar3;
        this.f47240d = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        C51452if ifVar;
        List list = (List) obj;
        C69464a aVar = this.f47239c;
        C58833ax axVar = (C58833ax) list.get(1);
        C16384t tVar = (C16384t) C16385u.f48225d.createBuilder();
        C58528ij H = C58528ij.m90008H(((String) aVar.mo17428b()).split(","));
        Iterator<ResolveInfo> it = ((Context) list.get(0)).getPackageManager().queryIntentServices(new Intent("android.media.browse.MediaBrowserService"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                C59104x b = C15910b.f47237a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "MediaSignalModule");
                ((C59052c) ((C59052c) b).mo56372aa(46498)).mo56386p("No media apps are installed.");
                break;
            }
            ResolveInfo next = it.next();
            if (next != null && next.serviceInfo != null && H.contains(next.serviceInfo.packageName)) {
                tVar.copyOnWrite();
                C16385u uVar = (C16385u) tVar.instance;
                uVar.f48227a |= 2;
                uVar.f48229c = true;
                break;
            }
        }
        if (axVar.mo56113h()) {
            if (((C12110b) axVar.mo56107c()).mo20416f().getState() == 3) {
                ifVar = C51452if.PLAYING;
            } else {
                ifVar = C51452if.UNKNOWN_STATE;
            }
            tVar.copyOnWrite();
            C16385u uVar2 = (C16385u) tVar.instance;
            uVar2.f48228b = ifVar.f134016m;
            uVar2.f48227a |= 1;
        }
        C58976aa aaVar = C58975e.f156826a;
        return C60856cj.m92900i(C58833ax.m90834k((C16385u) tVar.build()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f47238a.mo60297gq(), this.f47240d.mo60297gq());
    }
}
