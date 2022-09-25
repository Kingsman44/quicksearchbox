package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import com.evernote.android.state.BuildConfig;
import com.google.android.gms.common.util.C144014n;

/* renamed from: com.google.android.gms.measurement.internal.du */
/* compiled from: PG */
final class C145322du implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f392782a;

    /* renamed from: b */
    final /* synthetic */ String f392783b;

    /* renamed from: c */
    final /* synthetic */ Object f392784c;

    /* renamed from: d */
    final /* synthetic */ Object f392785d;

    /* renamed from: e */
    final /* synthetic */ Object f392786e;

    /* renamed from: f */
    final /* synthetic */ C145325dx f392787f;

    public C145322du(C145325dx dxVar, int i, String str, Object obj, Object obj2, Object obj3) {
        this.f392787f = dxVar;
        this.f392782a = i;
        this.f392783b = str;
        this.f392784c = obj;
        this.f392785d = obj2;
        this.f392786e = obj3;
    }

    public final void run() {
        C145339ek g = this.f392787f.f393011w.mo120971g();
        if (g.mo121005n()) {
            C145325dx dxVar = this.f392787f;
            if (dxVar.f392793a == 0) {
                C145222ab abVar = dxVar.f393011w.f392937g;
                if (abVar.f392551b == null) {
                    synchronized (abVar) {
                        if (abVar.f392551b == null) {
                            ApplicationInfo applicationInfo = abVar.f393011w.f392931a.getApplicationInfo();
                            String a = C144014n.m234194a();
                            if (applicationInfo != null) {
                                String str = applicationInfo.processName;
                                abVar.f392551b = Boolean.valueOf(str != null && str.equals(a));
                            }
                            if (abVar.f392551b == null) {
                                abVar.f392551b = Boolean.TRUE;
                                abVar.f393011w.mo120965ar().f392795c.mo120894a("My process not in the list of running processes");
                            }
                        }
                    }
                }
                if (abVar.f392551b.booleanValue()) {
                    C145325dx dxVar2 = this.f392787f;
                    C145508x xVar = dxVar2.f393011w.f392936f;
                    dxVar2.f392793a = 'C';
                } else {
                    C145325dx dxVar3 = this.f392787f;
                    C145508x xVar2 = dxVar3.f393011w.f392936f;
                    dxVar3.f392793a = 'c';
                }
            }
            C145325dx dxVar4 = this.f392787f;
            if (dxVar4.f392794b < 0) {
                dxVar4.f393011w.f392937g.mo120770f();
                dxVar4.f392794b = 74009;
            }
            char charAt = "01VDIWEA?".charAt(this.f392782a);
            C145325dx dxVar5 = this.f392787f;
            String str2 = "2" + charAt + dxVar5.f392793a + dxVar5.f392794b + ":" + C145325dx.m236117c(true, this.f392783b, this.f392784c, this.f392785d, this.f392786e);
            if (str2.length() > 1024) {
                str2 = this.f392783b.substring(0, 1024);
            }
            C145337ei eiVar = g.f392850c;
            if (eiVar != null) {
                eiVar.f392843e.mo120904g();
                if (eiVar.mo120917a() == 0) {
                    eiVar.mo120918b();
                }
                if (str2 == null) {
                    str2 = BuildConfig.FLAVOR;
                }
                long j = eiVar.f392843e.mo120921a().getLong(eiVar.f392840b, 0);
                if (j <= 0) {
                    SharedPreferences.Editor edit = eiVar.f392843e.mo120921a().edit();
                    edit.putString(eiVar.f392841c, str2);
                    edit.putLong(eiVar.f392840b, 1);
                    edit.apply();
                    return;
                }
                long nextLong = eiVar.f392843e.f393011w.mo120977o().mo121249C().nextLong();
                long j2 = j + 1;
                SharedPreferences.Editor edit2 = eiVar.f392843e.mo120921a().edit();
                if ((Long.MAX_VALUE & nextLong) < Long.MAX_VALUE / j2) {
                    edit2.putString(eiVar.f392841c, str2);
                }
                edit2.putLong(eiVar.f392840b, j2);
                edit2.apply();
                return;
            }
            return;
        }
        Log.println(6, this.f392787f.mo120899f(), "Persisted config not initialized. Not logging error/warn");
    }
}
