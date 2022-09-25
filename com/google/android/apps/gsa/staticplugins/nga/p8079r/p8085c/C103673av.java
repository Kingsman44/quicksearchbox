package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8085c;

import androidx.p104d.p105a.C2164c;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80143bu;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80159ch;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80160ci;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80161cj;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80162ck;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80275dd;
import com.google.android.libraries.social.populous.Autocompletion;
import com.google.android.libraries.social.populous.C42152af;
import com.google.android.libraries.social.populous.C42182ao;
import com.google.android.libraries.social.populous.Person;
import com.google.android.libraries.social.populous.core.C42309ch;
import com.google.android.libraries.social.populous.core.Name;
import com.google.android.libraries.social.populous.core.Photo;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import p3186j$.util.DesugarArrays;
import p3186j$.util.Objects;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.c.av */
/* compiled from: PG */
public final /* synthetic */ class C103673av implements C42182ao {

    /* renamed from: a */
    public final /* synthetic */ C80159ch f288768a;

    /* renamed from: b */
    public final /* synthetic */ C2164c f288769b;

    public /* synthetic */ C103673av(C80159ch chVar, C2164c cVar) {
        this.f288768a = chVar;
        this.f288769b = cVar;
    }

    /* renamed from: a */
    public final void mo44713a(Autocompletion[] autocompletionArr, C42152af afVar) {
        C80162ck ckVar;
        C80159ch chVar = this.f288768a;
        C2164c cVar = this.f288769b;
        C58480gp gpVar = new C58480gp(4);
        for (Autocompletion autocompletion : autocompletionArr) {
            if (autocompletion.mo44774c() == C42309ch.PERSON) {
                Person b = autocompletion.mo44773b();
                if (b == null) {
                    ((C58970a) ((C58970a) C103679ba.f288778a.mo56225c()).mo56372aa(21643)).mo56386p("Autocompletion of type Person must never have person set to null.");
                }
                if (!(b == null || b.mo44831b().length == 0)) {
                    C80160ci ciVar = (C80160ci) C80161cj.f219962e.createBuilder();
                    Name[] d = b.mo44833d();
                    int length = d.length;
                    String str = BuildConfig.FLAVOR;
                    String obj = length > 0 ? d[0].f110777a.toString() : str;
                    ciVar.copyOnWrite();
                    C80161cj cjVar = (C80161cj) ciVar.instance;
                    obj.getClass();
                    cjVar.f219964a |= 1;
                    cjVar.f219965b = obj;
                    Photo[] f = b.mo44837f();
                    if (f.length > 0) {
                        str = f[0].mo45048d();
                    }
                    ciVar.copyOnWrite();
                    C80161cj cjVar2 = (C80161cj) ciVar.instance;
                    str.getClass();
                    cjVar2.f219964a |= 2;
                    cjVar2.f219967d = str;
                    Stream map = DesugarArrays.stream((T[]) b.mo44831b()).map(C103676ay.f288775a);
                    Objects.requireNonNull(ciVar);
                    map.forEach(new C103677az(ciVar));
                    gpVar.mo55395g((C80161cj) ciVar.build());
                }
            }
        }
        C58485gu f2 = gpVar.mo55394f();
        chVar.copyOnWrite();
        C80162ck ckVar2 = (C80162ck) chVar.instance;
        C80162ck ckVar3 = C80162ck.f219968b;
        C62971cq cqVar = ckVar2.f219970a;
        if (!cqVar.mo58948c()) {
            ckVar2.f219970a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) f2, (List) ckVar2.f219970a);
        if (afVar.f110406b) {
            C80143bu buVar = (C80143bu) C80275dd.f220288c.createBuilder();
            buVar.copyOnWrite();
            C80275dd ddVar = (C80275dd) buVar.instance;
            C80162ck ckVar4 = (C80162ck) chVar.build();
            ckVar4.getClass();
            ddVar.f220291b = ckVar4;
            ddVar.f220290a = 4;
            C80275dd ddVar2 = (C80275dd) buVar.build();
            if (ddVar2.f220290a == 4) {
                ckVar = (C80162ck) ddVar2.f220291b;
            } else {
                ckVar = C80162ck.f219968b;
            }
            ckVar.f219970a.size();
            cVar.mo5437b(ddVar2);
        }
    }
}
