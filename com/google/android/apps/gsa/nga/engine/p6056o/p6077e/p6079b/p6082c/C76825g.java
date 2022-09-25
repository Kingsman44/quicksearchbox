package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6079b.p6082c;

import android.os.Bundle;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.assistant.p1484g.p1490c.p1495b.C18102c;
import com.google.assistant.p3931f.p3932a.p3933a.p3934a.p3935a.C52801c;
import com.google.assistant.p3931f.p3932a.p3933a.p3934a.p3935a.C52802d;
import com.google.assistant.p3931f.p3939c.C52825b;
import com.google.assistant.p3931f.p3939c.C52828e;
import com.google.assistant.p3931f.p3939c.C52829f;
import com.google.common.base.C58827ar;
import com.google.common.p4522b.C58485gu;
import java.util.ArrayList;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.b.c.g */
/* compiled from: PG */
public final /* synthetic */ class C76825g implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C76825g f212225a = new C76825g();

    private /* synthetic */ C76825g() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Optional optional;
        C18102c cVar = (C18102c) obj;
        C58827ar arVar = C76826h.f212226a;
        Optional map = Optional.ofNullable(cVar.mo23595a()).map(C76821c.f212221a);
        boolean isPresent = map.isPresent();
        String str = BuildConfig.FLAVOR;
        if (isPresent) {
            try {
                ArrayList arrayList = new ArrayList();
                for (C52825b bVar : ((C52829f) C52801c.m86708a((Bundle) map.get(), "app_action_metadata", C52829f.f138611c)).f138613a) {
                    ArrayList arrayList2 = new ArrayList();
                    for (C52828e eVar : bVar.f138598d) {
                        List list = (List) Collection.EL.stream(eVar.f138606c).map(C76820b.f212220a).collect(Collectors.toList());
                        if (!list.isEmpty()) {
                            optional = Optional.m71637of(String.format("&nbsp; → %s: %.30s", new Object[]{eVar.f138604a, C76826h.f212226a.mo56097d(list)}));
                        } else {
                            optional = Optional.empty();
                        }
                        if (optional.isPresent()) {
                            arrayList2.add((String) optional.get());
                        }
                    }
                    Object[] objArr = new Object[3];
                    objArr[0] = bVar.f138596b;
                    objArr[1] = bVar.f138597c;
                    objArr[2] = arrayList2.isEmpty() ? str : "<br>".concat(C76826h.f212227b.mo56097d(arrayList2));
                    arrayList.add(String.format("&nbsp; • %s (AC: %s)%s", objArr));
                }
                return C76826h.f212227b.mo56097d(arrayList);
            } catch (C52802d unused) {
                return "🤦";
            }
        } else {
            String d = C76826h.f212226a.mo56097d(C76826h.m123446c(cVar, "arguments"));
            C58485gu c = C76826h.m123446c(cVar, "results");
            int size = c.size();
            if (size != 0) {
                if (size != 1) {
                    str = String.format(" → (%s)", new Object[]{C76826h.f212226a.mo56097d(c)});
                } else {
                    str = " → ".concat(String.valueOf((String) c.get(0)));
                }
            }
            return String.format("&nbsp; • %s(%s)%s", new Object[]{cVar.mo23599e(), d, str});
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
