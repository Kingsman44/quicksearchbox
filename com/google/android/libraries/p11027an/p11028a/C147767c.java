package com.google.android.libraries.p11027an.p11028a;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.an.a.c */
/* compiled from: PG */
public final class C147767c {

    /* renamed from: a */
    public final StringBuilder f398712a = new StringBuilder();

    /* renamed from: b */
    private final List f398713b = new ArrayList();

    /* renamed from: a */
    public final C147766b mo124445a() {
        return new C147765a(this.f398712a.toString(), this.f398713b);
    }

    /* renamed from: b */
    public final void mo124446b(String str, Object... objArr) {
        this.f398712a.append(str);
        if (objArr != null) {
            int size = this.f398713b.size();
            int length = objArr.length;
            if (size + length <= 999) {
                int i = 0;
                while (i < length) {
                    Object obj = objArr[i];
                    if (obj != null) {
                        this.f398713b.add(obj.toString());
                        i++;
                    } else {
                        throw new IllegalArgumentException("Bind argument can't be null for query".concat(str));
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Single SQL statements support at most 999 parameters.");
        }
    }
}
