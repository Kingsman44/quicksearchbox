package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.evernote.android.state.BuildConfig;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.util.C144006f;

/* renamed from: com.google.android.gms.measurement.internal.dx */
/* compiled from: PG */
public final class C145325dx extends C145381fz {

    /* renamed from: a */
    public char f392793a = 0;

    /* renamed from: b */
    public long f392794b = -1;

    /* renamed from: c */
    public final C145323dv f392795c = new C145323dv(this, 6, false, false);

    /* renamed from: d */
    public final C145323dv f392796d = new C145323dv(this, 6, true, false);

    /* renamed from: e */
    public final C145323dv f392797e = new C145323dv(this, 6, false, true);

    /* renamed from: f */
    public final C145323dv f392798f = new C145323dv(this, 5, false, false);

    /* renamed from: g */
    public final C145323dv f392799g = new C145323dv(this, 5, true, false);

    /* renamed from: h */
    public final C145323dv f392800h = new C145323dv(this, 5, false, true);

    /* renamed from: i */
    public final C145323dv f392801i = new C145323dv(this, 4, false, false);

    /* renamed from: j */
    public final C145323dv f392802j = new C145323dv(this, 3, false, false);

    /* renamed from: k */
    public final C145323dv f392803k = new C145323dv(this, 2, false, false);

    /* renamed from: l */
    private String f392804l;

    public C145325dx(C145361ff ffVar) {
        super(ffVar);
    }

    /* renamed from: a */
    protected static Object m236116a(String str) {
        if (str == null) {
            return null;
        }
        return new C145324dw(str);
    }

    /* renamed from: c */
    static String m236117c(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String str2 = BuildConfig.FLAVOR;
        if (str == null) {
            str = str2;
        }
        String d = m236118d(z, obj);
        String d2 = m236118d(z, obj2);
        String d3 = m236118d(z, obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(d)) {
            sb.append(str2);
            sb.append(d);
            str2 = str3;
        }
        if (!TextUtils.isEmpty(d2)) {
            sb.append(str2);
            sb.append(d2);
        } else {
            str3 = str2;
        }
        if (!TextUtils.isEmpty(d3)) {
            sb.append(str3);
            sb.append(d3);
        }
        return sb.toString();
    }

    /* renamed from: d */
    static String m236118d(boolean z, Object obj) {
        String className;
        String str = BuildConfig.FLAVOR;
        if (obj == null) {
            return str;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf((long) ((Integer) obj).intValue());
        }
        int i = 0;
        if (obj instanceof Long) {
            if (!z) {
                return obj.toString();
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return obj.toString();
            }
            if (obj.toString().charAt(0) == '-') {
                str = "-";
            }
            String valueOf = String.valueOf(Math.abs(l.longValue()));
            long round = Math.round(Math.pow(10.0d, (double) (valueOf.length() - 1)));
            long round2 = Math.round(Math.pow(10.0d, (double) valueOf.length()) - 4.0d);
            return str + round + "..." + str + round2;
        } else if (obj instanceof Boolean) {
            return obj.toString();
        } else {
            if (obj instanceof Throwable) {
                Throwable th = (Throwable) obj;
                StringBuilder sb = new StringBuilder(z ? th.getClass().getName() : th.toString());
                String i2 = m236119i(C145361ff.class.getCanonicalName());
                StackTraceElement[] stackTrace = th.getStackTrace();
                int length = stackTrace.length;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    StackTraceElement stackTraceElement = stackTrace[i];
                    if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && m236119i(className).equals(i2)) {
                        sb.append(": ");
                        sb.append(stackTraceElement);
                        break;
                    }
                    i++;
                }
                return sb.toString();
            } else if (obj instanceof C145324dw) {
                return ((C145324dw) obj).f392792a;
            } else {
                if (z) {
                    return "-";
                }
                return obj.toString();
            }
        }
    }

    /* renamed from: i */
    private static String m236119i(String str) {
        if (TextUtils.isEmpty(str)) {
            return BuildConfig.FLAVOR;
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf == -1) {
            return str;
        }
        return str.substring(0, lastIndexOf);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo120834b() {
        return false;
    }

    /* renamed from: e */
    public final String mo120898e() {
        long j;
        Pair pair;
        if (this.f393011w.mo120971g().f392850c != null) {
            C145337ei eiVar = this.f393011w.mo120971g().f392850c;
            eiVar.f392843e.mo120904g();
            eiVar.f392843e.mo120904g();
            long a = eiVar.mo120917a();
            if (a == 0) {
                eiVar.mo120918b();
                j = 0;
            } else {
                C144006f fVar = eiVar.f392843e.f393011w.f392924A;
                j = Math.abs(a - System.currentTimeMillis());
            }
            long j2 = eiVar.f392842d;
            if (j >= j2) {
                if (j > j2 + j2) {
                    eiVar.mo120918b();
                } else {
                    String string = eiVar.f392843e.mo120921a().getString(eiVar.f392841c, (String) null);
                    long j3 = eiVar.f392843e.mo120921a().getLong(eiVar.f392840b, 0);
                    eiVar.mo120918b();
                    pair = (string == null || j3 <= 0) ? C145339ek.f392848a : new Pair(string, Long.valueOf(j3));
                    if (!(pair == null || pair == C145339ek.f392848a)) {
                        return String.valueOf(pair.second) + ":" + ((String) pair.first);
                    }
                }
            }
            pair = null;
            return String.valueOf(pair.second) + ":" + ((String) pair.first);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo120900h(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && Log.isLoggable(mo120899f(), i)) {
            Log.println(i, mo120899f(), m236117c(false, str, obj, obj2, obj3));
        }
        if (!z2 && i >= 5) {
            C143919bh.m233958a(str);
            C145358fc fcVar = this.f393011w.f392940j;
            if (fcVar == null) {
                Log.println(6, mo120899f(), "Scheduler not set. Not logging error/warn");
            } else if (fcVar.mo121005n()) {
                fcVar.mo120960h(new C145322du(this, i >= 9 ? 8 : i, str, obj, obj2, obj3));
            } else {
                Log.println(6, mo120899f(), "Scheduler not initialized. Not logging error/warn");
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final String mo120899f() {
        String str;
        synchronized (this) {
            if (this.f392804l == null) {
                String str2 = this.f393011w.f392934d;
                if (str2 != null) {
                    this.f392804l = str2;
                } else {
                    this.f392804l = this.f393011w.f392937g.mo120774k();
                }
            }
            C143919bh.m233958a(this.f392804l);
            str = this.f392804l;
        }
        return str;
    }
}
