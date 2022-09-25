package com.google.ads.interactivemedia.p367v3.internal;

import com.google.ads.interactivemedia.p367v3.impl.data.C6731ax;
import java.math.BigInteger;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ago */
/* compiled from: PG */
public final class ago extends agj {

    /* renamed from: a */
    private static final Class[] f20629a = {Integer.TYPE, Long.TYPE, Short.TYPE, Float.TYPE, Double.TYPE, Byte.TYPE, Boolean.TYPE, Character.TYPE, Integer.class, Long.class, Short.class, Float.class, Double.class, Byte.class, Boolean.class, Character.class};

    /* renamed from: b */
    private Object f20630b;

    public ago(Boolean bool) {
        mo14730a(bool);
    }

    /* renamed from: i */
    private static boolean m18684i(ago ago) {
        Object obj = ago.f20630b;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        if ((number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo14730a(Object obj) {
        if (obj instanceof Character) {
            this.f20630b = String.valueOf(((Character) obj).charValue());
            return;
        }
        boolean z = true;
        if (!(obj instanceof Number) && !(obj instanceof String)) {
            Class<?> cls = obj.getClass();
            Class[] clsArr = f20629a;
            int i = 0;
            while (true) {
                if (i >= 16) {
                    z = false;
                    break;
                } else if (clsArr[i].isAssignableFrom(cls)) {
                    break;
                } else {
                    i++;
                }
            }
        }
        C6731ax.m18029e(z);
        this.f20630b = obj;
    }

    /* renamed from: b */
    public final boolean mo14731b() {
        return this.f20630b instanceof Boolean;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final Boolean mo14732c() {
        return (Boolean) this.f20630b;
    }

    /* renamed from: d */
    public final boolean mo14733d() {
        if (mo14731b()) {
            return mo14732c().booleanValue();
        }
        return Boolean.parseBoolean(mo14738h());
    }

    /* renamed from: e */
    public final boolean mo14734e() {
        return this.f20630b instanceof Number;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ago ago = (ago) obj;
        if (this.f20630b == null) {
            return ago.f20630b == null;
        }
        if (m18684i(this) && m18684i(ago)) {
            return mo14736f().longValue() == ago.mo14736f().longValue();
        }
        Object obj2 = this.f20630b;
        if (!(obj2 instanceof Number) || !(ago.f20630b instanceof Number)) {
            return obj2.equals(ago.f20630b);
        }
        double doubleValue = mo14736f().doubleValue();
        double doubleValue2 = ago.mo14736f().doubleValue();
        if (doubleValue != doubleValue2) {
            return Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
        }
        return true;
    }

    /* renamed from: f */
    public final Number mo14736f() {
        Object obj = this.f20630b;
        return obj instanceof String ? new ahu((String) obj) : (Number) obj;
    }

    /* renamed from: g */
    public final boolean mo14737g() {
        return this.f20630b instanceof String;
    }

    /* renamed from: h */
    public final String mo14738h() {
        if (mo14734e()) {
            return mo14736f().toString();
        }
        if (mo14731b()) {
            return mo14732c().toString();
        }
        return (String) this.f20630b;
    }

    public final int hashCode() {
        long doubleToLongBits;
        if (this.f20630b == null) {
            return 31;
        }
        if (m18684i(this)) {
            doubleToLongBits = mo14736f().longValue();
        } else {
            Object obj = this.f20630b;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(mo14736f().doubleValue());
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    public ago(Number number) {
        mo14730a(number);
    }

    public ago(String str) {
        mo14730a(str);
    }
}
