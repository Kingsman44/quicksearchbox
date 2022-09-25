package com.google.android.libraries.social.peoplekit.common.dataservice.populous;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.social.peoplekit.common.dataservice.C42097g;
import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;
import com.google.android.libraries.social.peoplekit.configs.PeopleKitConfigImpl;
import com.google.android.libraries.social.populous.C42197bb;
import com.google.android.libraries.social.populous.C42199bd;
import com.google.android.libraries.social.populous.Person;
import com.google.android.libraries.social.populous.core.C42298bx;
import com.google.android.libraries.social.populous.core.C42318cq;
import com.google.android.libraries.social.populous.core.ContactMethodField;
import com.google.android.libraries.social.populous.core.InAppNotificationTarget;
import com.google.common.p4522b.C58495hd;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.libraries.social.peoplekit.common.dataservice.populous.r */
/* compiled from: PG */
final class C42124r implements C42197bb {

    /* renamed from: a */
    final /* synthetic */ Map f110182a;

    /* renamed from: b */
    final /* synthetic */ Map f110183b;

    /* renamed from: c */
    final /* synthetic */ Map f110184c;

    /* renamed from: d */
    final /* synthetic */ C42126t f110185d;

    public C42124r(C42126t tVar, Map map, Map map2, Map map3) {
        this.f110185d = tVar;
        this.f110182a = map;
        this.f110183b = map2;
        this.f110184c = map3;
    }

    /* renamed from: a */
    public final void mo44736a(Map map, C42199bd bdVar) {
        Person person;
        PopulousChannel populousChannel;
        C42126t tVar = this.f110185d;
        Map map2 = this.f110182a;
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : ((C58495hd) map).entrySet()) {
            for (C42125s sVar : (List) map2.get(entry.getKey())) {
                if (!hashMap.containsKey(sVar.f110186a) && (person = (Person) entry.getValue()) != null) {
                    PopulousChannel populousChannel2 = sVar.f110187b;
                    if (person.mo44832c().length == 0) {
                        populousChannel = null;
                    } else {
                        InAppNotificationTarget inAppNotificationTarget = person.mo44832c()[0];
                        C42298bx c = inAppNotificationTarget.mo45012c();
                        C42318cq cqVar = new C42318cq();
                        cqVar.mo45298c(inAppNotificationTarget.mo44976b());
                        c.mo45260d(cqVar.mo45296a());
                        C42318cq cqVar2 = new C42318cq();
                        cqVar2.mo45298c(person.mo44832c()[0].mo44976b());
                        cqVar2.f110985l = true;
                        c.mo45260d(cqVar2.mo45296a());
                        InAppNotificationTarget j = c.mo45264j();
                        C42111e eVar = new C42111e();
                        eVar.f110129a = 4;
                        String obj = j.mo44982g().toString();
                        int a = C42112f.m73902a(j);
                        eVar.f110130b = obj;
                        eVar.f110131c = a;
                        eVar.mo44728b(populousChannel2.f110074c, true, false);
                        eVar.f110134f = populousChannel2.f110075d;
                        eVar.f110138j = populousChannel2.f110076e;
                        eVar.f110139k = populousChannel2.f110077f;
                        PeopleKitConfigImpl peopleKitConfigImpl = (PeopleKitConfigImpl) tVar.f110197i;
                        eVar.f110151w = peopleKitConfigImpl.f110239f;
                        eVar.f110142n = false;
                        eVar.f110141m = populousChannel2.f110078g;
                        eVar.f110152x = peopleKitConfigImpl.f110250q ? populousChannel2.f110081j : null;
                        eVar.f110147s = populousChannel2.f110079h;
                        eVar.f110148t = populousChannel2.f110080i;
                        eVar.f110154z = j;
                        if (j.mo45016f().isEmpty()) {
                            String str = populousChannel2.f110072a;
                            int i = populousChannel2.f110073b;
                            eVar.f110149u = str;
                            eVar.f110150v = i;
                        } else {
                            ContactMethodField contactMethodField = (ContactMethodField) j.mo45016f().get(0);
                            String obj2 = contactMethodField.mo44982g().toString();
                            int a2 = C42112f.m73902a(contactMethodField);
                            eVar.f110149u = obj2;
                            eVar.f110150v = a2;
                        }
                        populousChannel = eVar.mo44727a();
                    }
                    if (populousChannel != null) {
                        hashMap.put(sVar.f110186a, populousChannel);
                    }
                }
            }
        }
        C42126t tVar2 = this.f110185d;
        Map map3 = this.f110183b;
        Map map4 = this.f110184c;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry2 : map3.entrySet()) {
            ArrayList arrayList2 = new ArrayList();
            if (hashMap.containsKey(entry2.getKey())) {
                PopulousChannel populousChannel3 = (PopulousChannel) hashMap.get(entry2.getKey());
                C42111e eVar2 = new C42111e();
                eVar2.f110129a = 4;
                String str2 = populousChannel3.f110072a;
                int i2 = populousChannel3.f110073b;
                eVar2.f110130b = str2;
                eVar2.f110131c = i2;
                eVar2.mo44728b(populousChannel3.f110074c, true, false);
                eVar2.f110134f = populousChannel3.f110075d;
                eVar2.f110138j = populousChannel3.f110076e;
                eVar2.f110139k = populousChannel3.f110077f;
                PeopleKitConfigImpl peopleKitConfigImpl2 = (PeopleKitConfigImpl) tVar2.f110197i;
                eVar2.f110151w = peopleKitConfigImpl2.f110239f;
                eVar2.f110142n = true;
                eVar2.f110141m = BuildConfig.FLAVOR;
                eVar2.f110152x = peopleKitConfigImpl2.f110250q ? populousChannel3.f110081j : null;
                eVar2.f110147s = populousChannel3.f110079h;
                eVar2.f110148t = populousChannel3.f110080i;
                eVar2.f110154z = populousChannel3.mo44697L();
                arrayList2.add(eVar2.mo44727a());
            }
            arrayList2.addAll((Collection) entry2.getValue());
            C42114h hVar = new C42114h();
            hVar.f110155a = arrayList2;
            arrayList.add(hVar.mo44731a());
        }
        for (Map.Entry entry3 : map4.entrySet()) {
            ArrayList arrayList3 = new ArrayList();
            if (hashMap.containsKey(entry3.getKey())) {
                arrayList3.add((Channel) hashMap.get(entry3.getKey()));
                tVar2.f110198j++;
            }
            arrayList3.addAll((Collection) entry3.getValue());
            C42114h hVar2 = new C42114h();
            hVar2.f110155a = arrayList3;
            arrayList.add(hVar2.mo44731a());
        }
        for (C42097g b : tVar2.f110196h) {
            b.mo44687b(arrayList, tVar2.f110198j);
        }
    }
}
