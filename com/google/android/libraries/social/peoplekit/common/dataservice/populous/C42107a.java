package com.google.android.libraries.social.peoplekit.common.dataservice.populous;

import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;
import java.util.Comparator;
import java.util.Map;

/* renamed from: com.google.android.libraries.social.peoplekit.common.dataservice.populous.a */
/* compiled from: PG */
public final class C42107a implements Comparator {

    /* renamed from: a */
    private final int f110123a;

    public C42107a(int i) {
        this.f110123a = i;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Channel channel = (Channel) obj;
        Channel channel2 = (Channel) obj2;
        Map a = C42108b.m73898a(this.f110123a);
        if (a.isEmpty()) {
            return 0;
        }
        int i = 10;
        int intValue = a.containsKey(Integer.valueOf(channel.mo44621b())) ? ((Integer) a.get(Integer.valueOf(channel.mo44621b()))).intValue() : 10;
        if (a.containsKey(Integer.valueOf(channel2.mo44621b()))) {
            i = ((Integer) a.get(Integer.valueOf(channel2.mo44621b()))).intValue();
        }
        return intValue - i;
    }
}
