package com.google.android.apps.gsa.nga.engine.warmactions.p6258j;

import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79570b;
import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79583o;
import com.google.android.apps.gsa.nga.shared.p6331aq.p6333b.C81013d;
import com.google.android.apps.gsa.nga.shared.p6331aq.p6333b.C81014e;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82476gp;
import com.google.common.p4526f.p4527a.C58970a;
import java.util.Collections;
import java.util.Map;
import java.util.regex.Pattern;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.function.Consumer;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.j.ar */
/* compiled from: PG */
public final /* synthetic */ class C79662ar implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C79672ba f218483a;

    public /* synthetic */ C79662ar(C79672ba baVar) {
        this.f218483a = baVar;
    }

    public final void accept(Object obj) {
        boolean z;
        C79672ba baVar = this.f218483a;
        C79690bs bsVar = (C79690bs) obj;
        C79693bv bvVar = baVar.f218503j;
        Map unmodifiableMap = Collections.unmodifiableMap(bsVar.mo74194b().mo74081b().mo74017a().f218319b);
        C79570b a = C79570b.m127648a(bsVar.mo74195c().f218349c);
        if (a == null) {
            a = C79570b.CONTEXT_TYPE_UNSPECIFIED;
        }
        Optional ofNullable = Optional.ofNullable((C79583o) unmodifiableMap.get(Integer.valueOf(a.f218339o)));
        if (ofNullable.isEmpty()) {
            C58970a aVar = (C58970a) ((C58970a) C79693bv.f218550a.mo56225c()).mo56372aa(5782);
            C79570b a2 = C79570b.m127648a(bsVar.mo74195c().f218349c);
            if (a2 == null) {
                a2 = C79570b.CONTEXT_TYPE_UNSPECIFIED;
            }
            aVar.mo56389s("#MWW missing config for context %s.", a2.name());
            z = false;
        } else {
            z = Pattern.compile("^(" + ((String) Collection.EL.stream(((C79583o) ofNullable.get()).f218361b).map(C79691bt.f218548a).map(C79692bu.f218549a).collect(Collectors.joining("|"))) + ")$", 2).matcher(bsVar.mo74199g().trim()).find();
        }
        C81013d dVar = bvVar.f218551b;
        C79570b a3 = C79570b.m127648a(bsVar.mo74195c().f218349c);
        if (a3 == null) {
            a3 = C79570b.CONTEXT_TYPE_UNSPECIFIED;
        }
        ((C81014e) dVar).f222055a.mo75579d(new C82476gp("NGA_WARM_ACTIONS_VALID_QUERY", a3.f218339o, z));
        if (!z) {
            C58970a aVar2 = (C58970a) ((C58970a) C79672ba.f218494a.mo56226d()).mo56372aa(5764);
            String g = bsVar.mo74199g();
            C79570b a4 = C79570b.m127648a(bsVar.mo74195c().f218349c);
            if (a4 == null) {
                a4 = C79570b.CONTEXT_TYPE_UNSPECIFIED;
            }
            aVar2.mo56360M("#MWW Query '%s' for context %s failed verification: '%s' (after %d events).", g, a4.name(), bsVar.mo74198f(), Long.valueOf(baVar.f218501h.get()));
            return;
        }
        baVar.mo74186o(bsVar);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
