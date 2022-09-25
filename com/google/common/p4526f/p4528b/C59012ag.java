package com.google.common.p4526f.p4528b;

import com.google.common.flogger.backend.google.GooglePlatform;
import com.google.common.p4526f.p4528b.p4529a.C58986e;
import com.google.common.p4526f.p4528b.p4530b.C59022f;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.common.f.b.ag */
public final class C59012ag {
    /* renamed from: a */
    public static C59011af m91238a() {
        try {
            return C58986e.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | NoClassDefFoundError | NoSuchMethodException | InvocationTargetException unused) {
            try {
                return GooglePlatform.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (IllegalAccessException | InstantiationException | NoClassDefFoundError | NoSuchMethodException | InvocationTargetException unused2) {
                try {
                    return C59022f.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (IllegalAccessException | InstantiationException | NoClassDefFoundError | NoSuchMethodException | InvocationTargetException unused3) {
                    return null;
                }
            }
        }
    }
}
