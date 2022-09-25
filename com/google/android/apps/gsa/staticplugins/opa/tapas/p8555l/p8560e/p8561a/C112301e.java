package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e.p8561a;

import com.google.research.p5181a.p5182a.C66278a;
import com.google.research.p5181a.p5182a.C66295r;
import com.google.research.p5181a.p5185c.C66316g;
import com.google.research.p5181a.p5186d.C66343o;
import com.google.research.p5181a.p5188f.C66376a;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.a.e */
/* compiled from: PG */
public abstract class C112301e extends C66316g {

    /* renamed from: a */
    protected HashMap f311641a = new HashMap();

    /* renamed from: b */
    protected HashMap f311642b = new HashMap();

    /* renamed from: c */
    protected boolean[] f311643c = new boolean[200];

    /* renamed from: d */
    protected int f311644d = 200;

    /* renamed from: e */
    protected int f311645e = Math.max(1, 4);

    /* renamed from: f */
    protected String f311646f = "FOREGROUND_APP";

    /* renamed from: a */
    public final int mo59505a() {
        return this.f311644d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C66343o mo59507c(C66278a aVar, C66376a aVar2) {
        int i;
        int i2;
        C66343o oVar = new C66343o(1, this.f311644d);
        List<String> f = mo99492f(aVar2);
        long c = aVar2.mo59467j().mo59503c();
        ArrayList<Integer> arrayList = new ArrayList<>(this.f311644d);
        int i3 = this.f311645e;
        for (String str : f) {
            Integer num = (Integer) this.f311641a.get(str);
            if (num != null) {
                i = num.intValue();
            } else {
                if (this.f311641a.size() != this.f311644d) {
                    int i4 = 0;
                    while (true) {
                        boolean[] zArr = this.f311643c;
                        if (i4 >= zArr.length) {
                            i2 = -1;
                            break;
                        } else if (!zArr[i4]) {
                            zArr[i4] = true;
                            i2 = i4;
                            break;
                        } else {
                            i4++;
                        }
                    }
                } else if (i3 > 0) {
                    long j = Long.MAX_VALUE;
                    String str2 = null;
                    for (Map.Entry entry : this.f311641a.entrySet()) {
                        Long l = (Long) this.f311642b.get(entry.getValue());
                        l.getClass();
                        long longValue = l.longValue();
                        if (longValue < j) {
                            str2 = (String) entry.getKey();
                            j = longValue;
                        }
                    }
                    str2.getClass();
                    Integer num2 = (Integer) this.f311641a.get(str2);
                    num2.getClass();
                    i2 = num2.intValue();
                    List asList = Arrays.asList(new String[]{str2});
                    if (!asList.isEmpty()) {
                        Integer num3 = (Integer) this.f311641a.remove((String) asList.get(0));
                        if (num3 != null) {
                            this.f311642b.remove(num3);
                            this.f311643c[num3.intValue()] = false;
                            mo59528r(num3);
                        }
                    }
                    this.f311643c[i2] = true;
                    i3--;
                }
                this.f311641a.put(str, Integer.valueOf(i2));
                i = i2;
            }
            HashMap hashMap = this.f311642b;
            Integer valueOf = Integer.valueOf(i);
            hashMap.put(valueOf, Long.valueOf(c));
            arrayList.add(valueOf);
        }
        for (Integer intValue : arrayList) {
            oVar.f180409c[intValue.intValue()] = 1.0d;
        }
        return oVar;
    }

    /* renamed from: d */
    public final String mo59509d() {
        return this.f311646f;
    }

    /* renamed from: f */
    public abstract List mo99492f(C66376a aVar);

    /* renamed from: i */
    public final void mo59514i(DataInputStream dataInputStream) {
        this.f311646f = dataInputStream.readUTF();
        int readInt = dataInputStream.readInt();
        this.f311644d = readInt;
        this.f311645e = Math.max(1, (int) (((float) readInt) * 0.02f));
        this.f311641a = C66295r.m96861b(dataInputStream, String.class, Integer.class);
        this.f311642b = C66295r.m96861b(dataInputStream, Integer.class, Long.class);
        this.f311643c = new boolean[this.f311644d];
        for (Integer intValue : this.f311641a.values()) {
            this.f311643c[intValue.intValue()] = true;
        }
    }

    /* renamed from: k */
    public final void mo59516k(DataOutputStream dataOutputStream) {
        dataOutputStream.writeUTF(this.f311646f);
        dataOutputStream.writeInt(this.f311644d);
        C66295r.m96862c(dataOutputStream, this.f311641a);
        C66295r.m96862c(dataOutputStream, this.f311642b);
    }
}
