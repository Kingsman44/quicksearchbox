package com.google.android.libraries.assistant.portable.p1584a.p1585a;

import android.util.Pair;
import com.evernote.android.state.BuildConfig;
import com.google.assistant.p3897e.p3917i.p3918a.C51370fe;
import com.google.assistant.p3897e.p3917i.p3918a.C51371ff;
import com.google.assistant.p3897e.p3917i.p3918a.C51372fg;
import com.google.assistant.p3897e.p3917i.p3918a.C51373fh;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.knowledge.p4661a.p4662a.C61746h;
import com.google.knowledge.p4661a.p4662a.C61751m;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.p5277z.p5282c.C68013c;
import com.google.p5277z.p5282c.C68014d;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62974ct;
import com.google.protos.p4850an.C63634r;
import java.util.List;
import p3186j$.util.OptionalInt;
import p3186j$.util.stream.IntStream;

/* renamed from: com.google.android.libraries.assistant.portable.a.a.c */
/* compiled from: PG */
public final class C19045c {

    /* renamed from: c */
    private static final C59071e f53447c = C59071e.m91332i("com.google.android.libraries.assistant.portable.a.a.c");

    /* renamed from: a */
    public C51370fe f53448a;

    /* renamed from: b */
    public boolean f53449b;

    /* renamed from: d */
    private int f53450d;

    /* renamed from: e */
    private int f53451e;

    public C19045c(C52091ex exVar) {
        m36482m(exVar);
        mo24276h(BuildConfig.FLAVOR);
    }

    /* renamed from: m */
    private final void m36482m(C52091ex exVar) {
        try {
            this.f53448a = (C51370fe) ((C51373fh) C19043a.m36480c(exVar, C51373fh.f133802b.getParserForType())).toBuilder();
        } catch (C62974ct unused) {
            this.f53448a = (C51370fe) C51373fh.f133802b.createBuilder();
        }
    }

    /* renamed from: a */
    public final Pair mo24269a(String str) {
        for (int i = 0; i < ((C51373fh) this.f53448a.instance).f133804a.size(); i++) {
            C51372fg a = this.f53448a.mo53596a(i);
            for (int i2 = 0; i2 < a.f133797d.size(); i2++) {
                C61752n nVar = ((C68014d) a.f133797d.get(i2)).f184280c;
                if (nVar == null) {
                    nVar = C61752n.f166808f;
                }
                if (str.equals(nVar.f166811b)) {
                    return Pair.create(C58833ax.m90834k(Integer.valueOf(i)), C58833ax.m90834k(Integer.valueOf(i2)));
                }
            }
        }
        C58836b bVar = C58836b.f156633a;
        return Pair.create(bVar, bVar);
    }

    /* renamed from: b */
    public final C52091ex mo24270b(C52091ex exVar) {
        return C19043a.m36478a(exVar, (C51373fh) this.f53448a.build());
    }

    /* renamed from: c */
    public final C68014d mo24271c() {
        if (!this.f53449b) {
            return C68014d.f184276f;
        }
        C51372fg a = this.f53448a.mo53596a(this.f53450d);
        return (C68014d) a.f133797d.get(this.f53451e);
    }

    /* renamed from: d */
    public final C68014d mo24272d(int i, int i2) {
        return (C68014d) this.f53448a.mo53596a(i).f133797d.get(i2);
    }

    /* renamed from: e */
    public final List mo24273e() {
        if (this.f53449b) {
            return this.f53448a.mo53596a(this.f53450d).f133798e;
        }
        return C58485gu.m89845m();
    }

    /* renamed from: f */
    public final void mo24274f(C63634r rVar) {
        C51370fe feVar = this.f53448a;
        C19051i.m36516a(rVar, feVar);
        this.f53448a = feVar;
    }

    /* renamed from: g */
    public final void mo24275g(C61746h hVar) {
        C61752n nVar = mo24271c().f184280c;
        if (nVar == null) {
            nVar = C61752n.f166808f;
        }
        C61751m mVar = (C61751m) nVar.toBuilder();
        OptionalInt findFirst = IntStream.CC.range(0, ((C61752n) mVar.instance).f166812c.size()).filter(new C19044b(mVar, hVar)).findFirst();
        if (findFirst.isPresent()) {
            mVar.mo58188g(findFirst.getAsInt(), hVar);
            C61752n nVar2 = (C61752n) mVar.build();
            if (this.f53449b) {
                C68013c cVar = (C68013c) mo24271c().toBuilder();
                cVar.copyOnWrite();
                C68014d dVar = (C68014d) cVar.instance;
                nVar2.getClass();
                dVar.f184280c = nVar2;
                dVar.f184278a |= 2;
                mo24277i(cVar);
            }
        }
    }

    /* renamed from: h */
    public final void mo24276h(String str) {
        this.f53449b = true;
        if (((C51373fh) this.f53448a.instance).f133804a.size() <= 0 || mo24280l() <= 0) {
            C59104x c = f53447c.mo56225c();
            c.mo56378ag(C58975e.f156826a, "DISAccessor");
            ((C59052c) ((C59052c) c).mo56372aa(47533)).mo56386p("Empty DIS is not expected.");
            this.f53449b = false;
            return;
        }
        Pair a = mo24269a(str);
        if (!((C58833ax) a.first).mo56113h() || !((C58833ax) a.second).mo56113h()) {
            C59104x c2 = f53447c.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "DISAccessor");
            ((C59052c) ((C59052c) c2).mo56372aa(47534)).mo56386p("DIS is not found.");
            this.f53449b = false;
            return;
        }
        this.f53450d = ((Integer) ((C58833ax) a.first).mo56107c()).intValue();
        this.f53451e = ((Integer) ((C58833ax) a.second).mo56107c()).intValue();
    }

    /* renamed from: i */
    public final void mo24277i(C68013c cVar) {
        if (this.f53449b) {
            C51371ff ffVar = (C51371ff) this.f53448a.mo53596a(this.f53450d).toBuilder();
            ffVar.mo53603d(this.f53451e, cVar);
            this.f53448a.mo53599d(this.f53450d, (C51372fg) ffVar.build());
        }
    }

    /* renamed from: j */
    public final void mo24278j(int i, int i2, C68013c cVar) {
        C51371ff ffVar = (C51371ff) this.f53448a.mo53596a(i).toBuilder();
        ffVar.mo53603d(i2, cVar);
        this.f53448a.mo53599d(i, (C51372fg) ffVar.build());
    }

    /* renamed from: k */
    public final void mo24279k(List list) {
        if (this.f53449b) {
            C51371ff ffVar = (C51371ff) this.f53448a.mo53596a(this.f53450d).toBuilder();
            ffVar.copyOnWrite();
            ((C51372fg) ffVar.instance).f133798e = C51372fg.emptyProtobufList();
            ffVar.copyOnWrite();
            C51372fg fgVar = (C51372fg) ffVar.instance;
            fgVar.mo53605b();
            C62947c.addAll((Iterable) list, (List) fgVar.f133798e);
            this.f53448a.mo53599d(this.f53450d, (C51372fg) ffVar.build());
        }
    }

    /* renamed from: l */
    public final int mo24280l() {
        if (((C51373fh) this.f53448a.instance).f133804a.size() <= 0) {
            return 0;
        }
        return this.f53448a.mo53596a(0).f133797d.size();
    }

    public C19045c(C52091ex exVar, String str) {
        m36482m(exVar);
        mo24276h(str);
    }
}
