package com.google.ads.interactivemedia.p367v3.internal;

import java.io.BufferedReader;
import java.util.NoSuchElementException;
import java.util.Queue;

/* renamed from: com.google.ads.interactivemedia.v3.internal.zv */
/* compiled from: PG */
final class C7482zv {

    /* renamed from: a */
    private final BufferedReader f24640a;

    /* renamed from: b */
    private final Queue f24641b;

    /* renamed from: c */
    private String f24642c;

    public C7482zv(Queue queue, BufferedReader bufferedReader) {
        this.f24641b = queue;
        this.f24640a = bufferedReader;
    }

    /* renamed from: a */
    public final boolean mo16890a() {
        String trim;
        if (this.f24642c != null) {
            return true;
        }
        if (this.f24641b.isEmpty()) {
            do {
                String readLine = this.f24640a.readLine();
                this.f24642c = readLine;
                if (readLine == null) {
                    return false;
                }
                trim = readLine.trim();
                this.f24642c = trim;
            } while (trim.isEmpty());
            return true;
        }
        String str = (String) this.f24641b.poll();
        ary.m19467t(str);
        this.f24642c = str;
        return true;
    }

    /* renamed from: b */
    public final String mo16891b() {
        if (mo16890a()) {
            String str = this.f24642c;
            this.f24642c = null;
            return str;
        }
        throw new NoSuchElementException();
    }
}
