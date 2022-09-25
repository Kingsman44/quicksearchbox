package androidx.work;

import androidx.work.impl.p207b.C4470ae;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import p5462h.p5463a.C69514bd;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.work.aw */
/* compiled from: PG */
public abstract class C4399aw {

    /* renamed from: a */
    public boolean f14040a;

    /* renamed from: b */
    public UUID f14041b;

    /* renamed from: c */
    public C4470ae f14042c;

    /* renamed from: d */
    public final Set f14043d;

    /* renamed from: e */
    private final Class f14044e;

    public C4399aw(Class cls) {
        this.f14044e = cls;
        UUID randomUUID = UUID.randomUUID();
        C69664n.m101060f(randomUUID, "randomUUID()");
        this.f14041b = randomUUID;
        String uuid = this.f14041b.toString();
        C69664n.m101060f(uuid, "id.toString()");
        String name = cls.getName();
        C69664n.m101060f(name, "workerClass.name");
        C69664n.m101061g(uuid, "id");
        C69664n.m101061g(name, "workerClassName_");
        this.f14042c = new C4470ae(uuid, (C4394ar) null, name, (String) null, (C4632m) null, (C4632m) null, 0, 0, 0, (C4412h) null, 0, (C4375a) null, 0, 0, 0, 0, false, (C4389am) null, 0, 1048570, (byte[]) null);
        String name2 = cls.getName();
        C69664n.m101060f(name2, "workerClass.name");
        this.f14043d = C69514bd.m100888b(name2);
    }

    /* renamed from: a */
    public abstract C4400ax mo9316a();

    /* renamed from: b */
    public final C4400ax mo9337b() {
        C4400ax a = mo9316a();
        C4412h hVar = this.f14042c.f14226k;
        boolean z = true;
        if (!hVar.mo9355a() && !hVar.f14084e && !hVar.f14082c && !hVar.f14083d) {
            z = false;
        }
        C4470ae aeVar = this.f14042c;
        if (aeVar.f14233r) {
            if (z) {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
            } else if (aeVar.f14223h > 0) {
                throw new IllegalArgumentException("Expedited jobs cannot be delayed");
            }
        }
        UUID randomUUID = UUID.randomUUID();
        C69664n.m101060f(randomUUID, "randomUUID()");
        C69664n.m101061g(randomUUID, "id");
        this.f14041b = randomUUID;
        String uuid = randomUUID.toString();
        String str = uuid;
        C69664n.m101060f(uuid, "id.toString()");
        C4470ae aeVar2 = this.f14042c;
        C69664n.m101061g(uuid, "newId");
        C69664n.m101061g(aeVar2, "other");
        String str2 = aeVar2.f14219d;
        C4394ar arVar = aeVar2.f14218c;
        String str3 = aeVar2.f14220e;
        C4632m mVar = r10;
        C4632m mVar2 = new C4632m(aeVar2.f14221f);
        C4632m mVar3 = r11;
        C4632m mVar4 = new C4632m(aeVar2.f14222g);
        long j = aeVar2.f14223h;
        long j2 = aeVar2.f14224i;
        C4400ax axVar = a;
        C4470ae aeVar3 = r4;
        C4470ae aeVar4 = aeVar2;
        long j3 = aeVar2.f14225j;
        C4412h hVar2 = r18;
        C4412h hVar3 = aeVar4.f14226k;
        C69664n.m101061g(hVar3, "other");
        boolean z2 = hVar3.f14082c;
        boolean z3 = hVar3.f14083d;
        C4381ae aeVar5 = hVar3.f14081b;
        String str4 = str;
        boolean z4 = hVar3.f14084e;
        C4394ar arVar2 = arVar;
        boolean z5 = hVar3.f14085f;
        String str5 = str2;
        Set set = hVar3.f14088i;
        String str6 = str3;
        C4412h hVar4 = new C4412h(aeVar5, z2, z3, z4, z5, hVar3.f14086g, hVar3.f14087h, set);
        C4470ae aeVar6 = new C4470ae(str4, arVar2, str5, str6, mVar, mVar3, j, j2, j3, hVar2, aeVar4.f14227l, aeVar4.f14228m, aeVar4.f14229n, aeVar4.f14230o, aeVar4.f14231p, aeVar4.f14232q, aeVar4.f14233r, aeVar4.f14234s, aeVar4.f14235t, 524288, (byte[]) null);
        this.f14042c = aeVar3;
        return axVar;
    }

    /* renamed from: c */
    public final void mo9338c(String str) {
        C69664n.m101061g(str, "tag");
        this.f14043d.add(str);
    }

    /* renamed from: d */
    public final void mo9339d(C4412h hVar) {
        C69664n.m101061g(hVar, "constraints");
        this.f14042c.f14226k = hVar;
    }

    /* renamed from: e */
    public final void mo9340e(long j, TimeUnit timeUnit) {
        C69664n.m101061g(timeUnit, "timeUnit");
        this.f14042c.f14223h = timeUnit.toMillis(j);
        if (Long.MAX_VALUE - System.currentTimeMillis() <= this.f14042c.f14223h) {
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }
    }

    /* renamed from: f */
    public final void mo9341f(C4632m mVar) {
        C69664n.m101061g(mVar, "inputData");
        this.f14042c.f14221f = mVar;
    }
}
