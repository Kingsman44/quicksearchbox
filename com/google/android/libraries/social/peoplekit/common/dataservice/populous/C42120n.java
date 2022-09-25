package com.google.android.libraries.social.peoplekit.common.dataservice.populous;

import com.google.android.libraries.social.peoplekit.autocomplete.viewcontrollers.C42011d;
import com.google.android.libraries.social.peoplekit.autocomplete.viewcontrollers.C42012e;
import com.google.android.libraries.social.peoplekit.common.dataservice.C42096f;
import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;
import com.google.android.libraries.social.populous.C42197bb;
import com.google.android.libraries.social.populous.C42199bd;
import com.google.android.libraries.social.populous.Person;
import com.google.android.libraries.social.populous.core.C42321ct;
import com.google.android.libraries.social.populous.core.Email;
import com.google.android.libraries.social.populous.core.Name;
import com.google.android.libraries.social.populous.core.PersonFieldMetadata;
import com.google.common.p4522b.C58495hd;
import com.google.p4181bi.p4182a.C55790h;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.libraries.social.peoplekit.common.dataservice.populous.n */
/* compiled from: PG */
final class C42120n implements C42197bb {

    /* renamed from: a */
    final /* synthetic */ Map f110166a;

    /* renamed from: b */
    final /* synthetic */ List f110167b;

    /* renamed from: c */
    final /* synthetic */ List f110168c;

    /* renamed from: d */
    final /* synthetic */ List f110169d;

    /* renamed from: e */
    final /* synthetic */ Set f110170e;

    /* renamed from: f */
    final /* synthetic */ C42012e f110171f;

    public C42120n(Map map, List list, List list2, List list3, C42012e eVar, Set set) {
        this.f110166a = map;
        this.f110167b = list;
        this.f110168c = list2;
        this.f110169d = list3;
        this.f110171f = eVar;
        this.f110170e = set;
    }

    /* renamed from: a */
    public final void mo44736a(Map map, C42199bd bdVar) {
        Name name;
        for (C42321ct ctVar : ((C58495hd) map).keySet()) {
            Channel channel = (Channel) this.f110166a.get(ctVar);
            Person person = (Person) map.get(ctVar);
            boolean contains = this.f110167b.contains(channel);
            boolean contains2 = this.f110168c.contains(channel);
            boolean contains3 = this.f110169d.contains(channel);
            if (person != null) {
                if (contains && person.mo44837f().length != 0) {
                    channel.mo44643x(person.mo44837f()[0].mo45048d());
                }
                if (contains2 && person.mo44833d().length > 0 && (name = person.mo44833d()[0]) != null) {
                    String obj = name.f110777a.toString();
                    int i = name.f110781e;
                    channel.mo44641v(obj, i == 3, i == 2);
                    String str = name.f110778b;
                    if (str != null) {
                        channel.mo44639t(str.toString());
                    }
                    channel.mo44640u(C42096f.m73798c(name.f110777a.toString()));
                }
                if (contains3 && !person.f110366b.isEmpty()) {
                    Email email = (Email) person.f110366b.get(0);
                    Email.ExtendedData a = email.mo44975a();
                    if (a != null) {
                        C55790h b = a.mo45001b();
                        if (b != null && b.equals(C55790h.EXTERNAL)) {
                            channel.mo44619K(3);
                        } else if (b == null || !b.equals(C55790h.INTERNAL)) {
                            channel.mo44619K(1);
                        } else {
                            channel.mo44619K(2);
                        }
                    } else {
                        channel.mo44619K(1);
                    }
                    PersonFieldMetadata b2 = email.mo44976b();
                    if (b2 == null || !b2.f110797n) {
                        channel.mo44618J(1);
                    } else {
                        channel.mo44618J(2);
                    }
                }
            }
        }
        if (bdVar.mo44892d()) {
            C42012e eVar = this.f110171f;
            ArrayList<Channel> arrayList = new ArrayList<>(this.f110170e);
            ArrayList arrayList2 = new ArrayList();
            for (Channel channel2 : arrayList) {
                int I = channel2.mo44617I();
                if (!(channel2.mo44638s() == null && (I == 0 || I == 1))) {
                    eVar.f109708a.f109724a.post(new C42011d(eVar, channel2));
                }
                if (channel2.mo44617I() == 3 && channel2.mo44616H() != 2) {
                    arrayList2.add(channel2);
                }
            }
        }
    }
}
