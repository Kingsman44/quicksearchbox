package com.google.android.libraries.storage.p3304a.p3305a;

import android.accounts.Account;
import com.google.common.base.C58817ah;
import com.google.protobuf.C62995dn;
import com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4775b.p4780b.p4781a.p4782a.C63128a;
import com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4775b.p4780b.p4781a.p4782a.C63129b;
import com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4775b.p4780b.p4781a.p4782a.C63131d;
import com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4775b.p4780b.p4781a.p4782a.C63132e;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.libraries.storage.a.a.m */
/* compiled from: PG */
public final /* synthetic */ class C42726m implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Account f111986a;

    /* renamed from: b */
    public final /* synthetic */ AtomicInteger f111987b;

    public /* synthetic */ C42726m(Account account, AtomicInteger atomicInteger) {
        this.f111986a = account;
        this.f111987b = atomicInteger;
    }

    public final Object apply(Object obj) {
        Integer num;
        Account account = this.f111986a;
        AtomicInteger atomicInteger = this.f111987b;
        C63132e eVar = (C63132e) obj;
        C63131d dVar = (C63131d) eVar.toBuilder();
        String str = account.name;
        String str2 = account.type;
        Iterator it = Collections.unmodifiableMap(eVar.f170482c).entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                num = null;
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            int intValue = ((Integer) entry.getKey()).intValue();
            C63129b bVar = (C63129b) entry.getValue();
            if (bVar.f170475b.equals(str) && bVar.f170476c.equals(str2)) {
                num = Integer.valueOf(intValue);
                break;
            }
        }
        if (num == null) {
            num = Integer.valueOf(eVar.f170481b);
            C63128a aVar = (C63128a) C63129b.f170472d.createBuilder();
            String str3 = account.name;
            aVar.copyOnWrite();
            C63129b bVar2 = (C63129b) aVar.instance;
            str3.getClass();
            bVar2.f170474a |= 1;
            bVar2.f170475b = str3;
            String str4 = account.type;
            aVar.copyOnWrite();
            C63129b bVar3 = (C63129b) aVar.instance;
            str4.getClass();
            bVar3.f170474a |= 2;
            bVar3.f170476c = str4;
            C63129b bVar4 = (C63129b) aVar.build();
            int intValue2 = num.intValue();
            dVar.copyOnWrite();
            C63132e eVar2 = (C63132e) dVar.instance;
            eVar2.f170480a |= 1;
            eVar2.f170481b = intValue2 + 1;
            int intValue3 = num.intValue();
            bVar4.getClass();
            dVar.copyOnWrite();
            C63132e eVar3 = (C63132e) dVar.instance;
            C62995dn dnVar = eVar3.f170482c;
            if (!dnVar.f170058b) {
                eVar3.f170482c = dnVar.mo58980a();
            }
            eVar3.f170482c.put(Integer.valueOf(intValue3), bVar4);
        }
        atomicInteger.set(num.intValue());
        return (C63132e) dVar.build();
    }
}
