package com.google.research.p5181a.p5187e;

import com.google.research.p5181a.p5182a.C66294q;
import com.google.research.p5181a.p5182a.C66295r;
import com.google.research.p5181a.p5188f.C66376a;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.research.a.e.m */
/* compiled from: PG */
public final class C66363m extends C66361k {

    /* renamed from: a */
    public Map f180449a = new HashMap();

    /* renamed from: b */
    private final List f180450b = new ArrayList();

    /* renamed from: a */
    private final void m97124a() {
        this.f180450b.clear();
        this.f180450b.addAll(this.f180449a.keySet());
        Collections.sort(this.f180450b, new C66362l(this));
    }

    /* renamed from: c */
    public final C66367q mo59571c(C66376a aVar) {
        if (!this.f180450b.isEmpty()) {
            int size = this.f180450b.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                String str = (String) this.f180450b.get(size);
                if (C66294q.m96858a((C66376a) this.f180449a.get(str), aVar) <= 21600000) {
                    break;
                }
                this.f180449a.remove(str);
            }
        }
        this.f180449a.put(aVar.mo59460c(), aVar);
        m97124a();
        return new C66367q();
    }

    /* renamed from: e */
    public final String mo59575e() {
        return "recency_event_predictor";
    }

    /* renamed from: g */
    public final void mo59580g(DataInputStream dataInputStream, C66376a aVar) {
        int readInt = dataInputStream.readInt();
        HashMap hashMap = new HashMap();
        for (int i = 0; i < readInt; i++) {
            int readInt2 = dataInputStream.readInt();
            byte[] bArr = new byte[readInt2];
            dataInputStream.read(bArr, 0, readInt2);
            hashMap.put((String) C66295r.m96860a(dataInputStream, String.class), aVar.mo59468k(bArr, readInt2));
        }
        this.f180449a = hashMap;
        m97124a();
    }

    /* renamed from: h */
    public final void mo59581h(DataOutputStream dataOutputStream) {
        Map map = this.f180449a;
        dataOutputStream.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            C66295r.m96863d(dataOutputStream, entry.getKey());
            byte[] e = ((C66376a) entry.getValue()).mo59462e();
            dataOutputStream.writeInt(e.length);
            dataOutputStream.write(e);
        }
    }

    /* renamed from: i */
    public final boolean mo59582i(C66376a aVar) {
        if (aVar.mo59463f() == 1 || aVar.mo59463f() == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public final void mo59594l(Integer num, Integer num2) {
        throw null;
    }

    /* renamed from: t */
    public final C66367q mo59574t(C66376a aVar) {
        C66367q qVar = new C66367q();
        if (!this.f180450b.isEmpty() && !this.f180449a.isEmpty()) {
            int i = 0;
            if (C66294q.m96858a((C66376a) this.f180449a.get(this.f180450b.get(0)), aVar) <= 21600000) {
                for (String str : this.f180450b) {
                    if (C66294q.m96858a((C66376a) this.f180449a.get(str), aVar) > 21600000) {
                        break;
                    }
                    i++;
                    qVar.f180459b.add(new C66366p(str, 1.0f / ((float) i), "recency_event_predictor"));
                }
            }
        }
        return qVar;
    }
}
