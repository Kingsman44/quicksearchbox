package com.google.android.libraries.assistant.gallium.framework;

import com.evernote.android.state.BuildConfig;
import com.google.common.p4522b.C58733pz;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protos.p5127o.C65664as;
import com.google.protos.p5127o.C65665at;
import com.google.protos.p5127o.C65685k;
import com.google.protos.p5127o.C65686l;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.libraries.assistant.gallium.framework.ak */
/* compiled from: PG */
public final class C18207ak {

    /* renamed from: a */
    public final Map f51728a;

    /* renamed from: b */
    public final C18216at f51729b;

    /* renamed from: c */
    private final String f51730c;

    @Deprecated
    public C18207ak() {
        this(new LinkedHashMap(), new C18216at(C58733pz.f156496a));
    }

    /* renamed from: a */
    public static C18207ak m35459a(Collection collection, Collection collection2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((C18204ah) it.next()).mo23685c());
        }
        if (linkedHashSet.size() == collection2.size()) {
            C18207ak akVar = new C18207ak(linkedHashMap, new C18216at(linkedHashSet));
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                C18206aj ajVar = (C18206aj) it2.next();
                String str = ajVar.mo23688a().mo23685c().f178473b;
                String c = ajVar.mo23690c();
                C65685k kVar = (C65685k) C65686l.f178470d.createBuilder();
                kVar.copyOnWrite();
                C65686l lVar = (C65686l) kVar.instance;
                str.getClass();
                lVar.f178472a |= 1;
                lVar.f178473b = str;
                if (c != null && !c.isEmpty()) {
                    kVar.copyOnWrite();
                    C65686l lVar2 = (C65686l) kVar.instance;
                    lVar2.f178472a |= 2;
                    lVar2.f178474c = c;
                }
                C65686l lVar3 = (C65686l) kVar.build();
                C18212ap b = ajVar.mo23689b();
                C18204ah a = ajVar.mo23688a();
                if (akVar.f51728a.containsKey(lVar3) || akVar.f51729b.mo23700d(lVar3)) {
                    throw C18218av.m35478a(3, "Registering multiple times an implementation for interface '" + C18214ar.m35471d(lVar3) + "'.");
                }
                akVar.f51728a.put(lVar3, new C18229c(a, b));
            }
            return akVar;
        }
        throw C18218av.m35478a(3, "The passed descriptors contain duplicate interface IDs");
    }

    /* renamed from: b */
    public final C65665at mo23691b() {
        C65664as asVar = (C65664as) C65665at.f178422e.createBuilder();
        asVar.copyOnWrite();
        C65665at atVar = (C65665at) asVar.instance;
        atVar.f178424a |= 1;
        atVar.f178425b = "java";
        LinkedHashSet linkedHashSet = new LinkedHashSet(this.f51728a.keySet());
        linkedHashSet.addAll(new LinkedHashSet(this.f51729b.f51740b));
        asVar.copyOnWrite();
        C65665at atVar2 = (C65665at) asVar.instance;
        C62971cq cqVar = atVar2.f178426c;
        if (!cqVar.mo58948c()) {
            atVar2.f178426c = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) linkedHashSet, (List) atVar2.f178426c);
        if (!this.f51730c.isEmpty()) {
            String str = this.f51730c;
            asVar.copyOnWrite();
            C65665at atVar3 = (C65665at) asVar.instance;
            str.getClass();
            atVar3.f178424a |= 2;
            atVar3.f178427d = str;
        }
        return (C65665at) asVar.build();
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return new C18207ak(new LinkedHashMap(this.f51728a), this.f51729b.clone());
    }

    private C18207ak(Map map, C18216at atVar) {
        String str;
        this.f51728a = map;
        this.f51729b = atVar;
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        int length = stackTrace.length;
        int i = 0;
        boolean z = false;
        while (true) {
            if (i >= length) {
                str = BuildConfig.FLAVOR;
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i];
            Class<C18207ak> cls = C18207ak.class;
            if (z || !stackTraceElement.getClassName().startsWith(cls.getCanonicalName())) {
                if (z && !stackTraceElement.getClassName().startsWith(cls.getCanonicalName())) {
                    str = stackTraceElement.toString();
                    break;
                }
            } else {
                z = true;
            }
            i++;
        }
        this.f51730c = str;
    }
}
