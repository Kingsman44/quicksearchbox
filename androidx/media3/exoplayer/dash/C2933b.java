package androidx.media3.exoplayer.dash;

import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.exoplayer.dash.p141a.C2911b;
import com.google.common.p4522b.C58557jl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* renamed from: androidx.media3.exoplayer.dash.b */
/* compiled from: PG */
public final class C2933b {

    /* renamed from: a */
    public final Map f8400a;

    /* renamed from: b */
    public final Map f8401b;

    /* renamed from: c */
    public final Map f8402c = new HashMap();

    /* renamed from: d */
    private final Random f8403d;

    public C2933b() {
        Random random = new Random();
        this.f8403d = random;
        this.f8400a = new HashMap();
        this.f8401b = new HashMap();
    }

    /* renamed from: c */
    public static void m8286c(Object obj, long j, Map map) {
        if (map.containsKey(obj)) {
            int i = C2612ak.f7249a;
            j = Math.max(j, ((Long) map.get(obj)).longValue());
        }
        map.put(obj, Long.valueOf(j));
    }

    /* renamed from: d */
    private static void m8287d(long j, Map map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            map.remove(arrayList.get(i));
        }
    }

    /* renamed from: a */
    public final C2911b mo6805a(List list) {
        C2911b bVar;
        List b = mo6806b(list);
        if (b.size() < 2) {
            return (C2911b) C58557jl.m90130k(b, (Object) null);
        }
        Collections.sort(b, C2909a.f8305a);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = ((C2911b) b.get(0)).f8314c;
        int i3 = 0;
        while (true) {
            if (i3 >= b.size()) {
                break;
            }
            C2911b bVar2 = (C2911b) b.get(i3);
            if (i2 == bVar2.f8314c) {
                arrayList.add(new Pair(bVar2.f8313b, Integer.valueOf(bVar2.f8315d)));
                i3++;
            } else if (arrayList.size() == 1) {
                return (C2911b) b.get(0);
            }
        }
        C2911b bVar3 = (C2911b) this.f8402c.get(arrayList);
        if (bVar3 != null) {
            return bVar3;
        }
        List subList = b.subList(0, arrayList.size());
        int i4 = 0;
        for (int i5 = 0; i5 < subList.size(); i5++) {
            i4 += ((C2911b) subList.get(i5)).f8315d;
        }
        int nextInt = this.f8403d.nextInt(i4);
        int i6 = 0;
        while (true) {
            if (i >= subList.size()) {
                bVar = (C2911b) C58557jl.m90131l(subList);
                break;
            }
            bVar = (C2911b) subList.get(i);
            i6 += bVar.f8315d;
            if (nextInt < i6) {
                break;
            }
            i++;
        }
        this.f8402c.put(arrayList, bVar);
        return bVar;
    }

    /* renamed from: b */
    public final List mo6806b(List list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        m8287d(elapsedRealtime, this.f8400a);
        m8287d(elapsedRealtime, this.f8401b);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            C2911b bVar = (C2911b) list.get(i);
            if (!this.f8400a.containsKey(bVar.f8313b) && !this.f8401b.containsKey(Integer.valueOf(bVar.f8314c))) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }
}
