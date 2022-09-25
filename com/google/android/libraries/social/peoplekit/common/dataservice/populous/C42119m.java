package com.google.android.libraries.social.peoplekit.common.dataservice.populous;

import android.text.TextUtils;
import com.google.android.libraries.social.peoplekit.common.dataservice.C42101k;
import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;
import com.google.android.libraries.social.populous.C42197bb;
import com.google.android.libraries.social.populous.C42199bd;
import com.google.android.libraries.social.populous.Person;
import com.google.android.libraries.social.populous.core.C42321ct;
import java.util.Map;

/* renamed from: com.google.android.libraries.social.peoplekit.common.dataservice.populous.m */
/* compiled from: PG */
final class C42119m implements C42197bb {

    /* renamed from: a */
    final /* synthetic */ Channel f110163a;

    /* renamed from: b */
    final /* synthetic */ C42321ct f110164b;

    /* renamed from: c */
    final /* synthetic */ C42101k f110165c;

    public C42119m(Channel channel, C42321ct ctVar, C42101k kVar) {
        this.f110163a = channel;
        this.f110164b = ctVar;
        this.f110165c = kVar;
    }

    /* renamed from: a */
    public final void mo44736a(Map map, C42199bd bdVar) {
        Channel channel = this.f110163a;
        Person person = (Person) map.get(this.f110164b);
        if (person != null) {
            String str = person.f110368d;
            if (!TextUtils.isEmpty(str)) {
                channel.mo44642w(str);
            }
        }
        if (bdVar.mo44892d()) {
            this.f110165c.mo44414a();
        }
    }
}
