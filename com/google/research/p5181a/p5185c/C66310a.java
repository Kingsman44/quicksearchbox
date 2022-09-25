package com.google.research.p5181a.p5185c;

import com.google.common.p4535g.C59203do;
import com.google.research.p5181a.p5182a.C66278a;
import com.google.research.p5181a.p5182a.C66284g;
import com.google.research.p5181a.p5182a.C66294q;
import com.google.research.p5181a.p5182a.C66295r;
import com.google.research.p5181a.p5186d.C66343o;
import com.google.research.p5181a.p5188f.C66376a;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.research.a.c.a */
/* compiled from: PG */
public class C66310a extends C66316g {

    /* renamed from: a */
    protected HashMap f180318a;

    /* renamed from: b */
    protected HashMap f180319b;

    /* renamed from: c */
    protected boolean[] f180320c;

    /* renamed from: d */
    protected int f180321d;

    /* renamed from: e */
    protected long f180322e;

    /* renamed from: f */
    protected long f180323f;

    /* renamed from: g */
    protected int f180324g;

    /* renamed from: h */
    protected final List f180325h;

    /* renamed from: i */
    public final List f180326i;

    public C66310a() {
        this.f180318a = new HashMap();
        this.f180319b = new HashMap();
        this.f180321d = 200;
        this.f180322e = 600000;
        this.f180323f = 0;
        this.f180324g = 2;
        this.f180325h = new ArrayList();
        this.f180326i = new ArrayList();
        this.f180320c = new boolean[this.f180321d];
    }

    /* renamed from: a */
    public int mo59505a() {
        return this.f180321d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C66343o mo59507c(C66278a aVar, C66376a aVar2) {
        ArrayList g = mo59512g(aVar, aVar2, this.f180322e, this.f180323f, this.f180324g);
        C66343o oVar = new C66343o(1, this.f180321d);
        int size = g.size();
        for (int i = 0; i < size; i++) {
            C66284g gVar = (C66284g) g.get(i);
            if (gVar.f180263b > 0.0f) {
                int i2 = gVar.f180262a;
                if (i2 < this.f180321d) {
                    oVar.f180409c[i2] = 1.0d;
                } else {
                    throw new RuntimeException("invalid index: " + gVar.f180262a);
                }
            }
        }
        for (double d : oVar.f180409c) {
            this.f180326i.add(Integer.valueOf(d != C59203do.f157270a ? 1 : 0));
        }
        return oVar;
    }

    /* renamed from: d */
    public String mo59509d() {
        return "local_app_launch_history";
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final int mo59510e(String str, long j) {
        Integer num = (Integer) this.f180318a.get(str);
        if (num == null) {
            int i = 0;
            if (this.f180318a.size() == this.f180321d) {
                long j2 = Long.MAX_VALUE;
                String str2 = null;
                for (Map.Entry entry : this.f180318a.entrySet()) {
                    long longValue = ((Long) this.f180319b.get(entry.getValue())).longValue();
                    if (longValue < j2) {
                        str2 = (String) entry.getKey();
                        j2 = longValue;
                    }
                }
                num = (Integer) this.f180318a.get(str2);
                List asList = Arrays.asList(new String[]{str2});
                if (!asList.isEmpty()) {
                    Integer num2 = (Integer) this.f180318a.remove((String) asList.get(0));
                    if (num2 != null) {
                        this.f180319b.remove(num2);
                        this.f180320c[num2.intValue()] = false;
                        mo59528r(num2);
                    }
                }
                this.f180320c[num.intValue()] = true;
            } else {
                while (true) {
                    boolean[] zArr = this.f180320c;
                    if (i >= zArr.length) {
                        break;
                    } else if (!zArr[i]) {
                        num = Integer.valueOf(i);
                        zArr[i] = true;
                        break;
                    } else {
                        i++;
                    }
                }
            }
            this.f180318a.put(str, num);
        }
        this.f180319b.put(num, Long.valueOf(j));
        return num.intValue();
    }

    /* renamed from: f */
    public C66310a clone() {
        C66310a aVar = new C66310a(this.f180321d, this.f180322e, this.f180323f, this.f180324g);
        aVar.mo59513h(this);
        return aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public ArrayList mo59512g(C66278a aVar, C66376a aVar2, long j, long j2, int i) {
        this.f180325h.clear();
        this.f180326i.clear();
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        int i2 = aVar.f180248b;
        while (true) {
            i2--;
            if (i2 < 0) {
                break;
            }
            C66376a aVar3 = (C66376a) aVar.mo59448a(i2);
            if (mo59515j(aVar3)) {
                long a = C66294q.m96858a(aVar3, aVar2) - aVar3.mo59458a();
                if (a >= j) {
                    break;
                } else if (a < j2) {
                    continue;
                } else {
                    if (!this.f180325h.contains(aVar3.mo59460c())) {
                        this.f180325h.add(aVar3.mo59460c());
                    }
                    int e = mo59510e(aVar3.mo59460c(), aVar2.mo59467j().mo59503c());
                    Integer valueOf = Integer.valueOf(e);
                    C66284g gVar = (C66284g) hashMap.get(valueOf);
                    if (gVar == null) {
                        if (hashMap.size() >= i) {
                            break;
                        }
                        gVar = new C66284g(e);
                        hashMap.put(valueOf, gVar);
                    }
                    gVar.f180263b += 1.0f;
                }
            }
        }
        arrayList.addAll(hashMap.values());
        return arrayList;
    }

    /* renamed from: h */
    public final void mo59513h(C66310a aVar) {
        for (Map.Entry entry : aVar.f180318a.entrySet()) {
            this.f180318a.put(entry.getKey(), entry.getValue());
        }
        for (Map.Entry entry2 : aVar.f180319b.entrySet()) {
            this.f180319b.put(entry2.getKey(), entry2.getValue());
        }
        boolean[] zArr = aVar.f180320c;
        this.f180320c = Arrays.copyOf(zArr, zArr.length);
        mo59526l(aVar.f180329j);
    }

    /* renamed from: i */
    public final void mo59514i(DataInputStream dataInputStream) {
        this.f180321d = dataInputStream.readInt();
        this.f180324g = dataInputStream.readInt();
        this.f180322e = dataInputStream.readLong();
        this.f180323f = dataInputStream.readLong();
        this.f180318a = C66295r.m96861b(dataInputStream, String.class, Integer.class);
        this.f180319b = C66295r.m96861b(dataInputStream, Integer.class, Long.class);
        this.f180320c = new boolean[this.f180321d];
        for (Integer intValue : this.f180318a.values()) {
            this.f180320c[intValue.intValue()] = true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public boolean mo59515j(C66376a aVar) {
        if (aVar.mo59463f() != 1 || aVar.mo59461d().size() <= 0) {
            return false;
        }
        return "GEL".equals(aVar.mo59461d().get(0));
    }

    /* renamed from: k */
    public final void mo59516k(DataOutputStream dataOutputStream) {
        dataOutputStream.writeInt(this.f180321d);
        dataOutputStream.writeInt(this.f180324g);
        dataOutputStream.writeLong(this.f180322e);
        dataOutputStream.writeLong(this.f180323f);
        C66295r.m96862c(dataOutputStream, this.f180318a);
        C66295r.m96862c(dataOutputStream, this.f180319b);
    }

    public C66310a(int i) {
        this.f180318a = new HashMap();
        this.f180319b = new HashMap();
        this.f180321d = 200;
        this.f180322e = 600000;
        this.f180323f = 0;
        this.f180324g = 2;
        this.f180325h = new ArrayList();
        this.f180326i = new ArrayList();
        this.f180321d = i;
        this.f180320c = new boolean[i];
    }

    public C66310a(int i, long j, long j2, int i2) {
        this.f180318a = new HashMap();
        this.f180319b = new HashMap();
        this.f180321d = 200;
        this.f180322e = 600000;
        this.f180323f = 0;
        this.f180324g = 2;
        this.f180325h = new ArrayList();
        this.f180326i = new ArrayList();
        this.f180324g = i2;
        this.f180322e = j;
        this.f180323f = j2;
        this.f180321d = i;
        this.f180320c = new boolean[i];
    }
}
