package com.google.android.apps.gsa.search.core.p6805i;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.apps.gsa.search.core.p6513aj.C84534as;
import com.google.android.apps.gsa.search.core.p6513aj.C84535at;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.search.core.preferences.C86342v;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: com.google.android.apps.gsa.search.core.i.aa */
/* compiled from: PG */
public final class C86101aa {

    /* renamed from: a */
    public static final C59071e f232726a = C59071e.m91332i("com.google.android.apps.gsa.search.core.i.aa");

    /* renamed from: b */
    public static HashSet f232727b = null;

    /* renamed from: c */
    public final C84534as f232728c;

    /* renamed from: d */
    private final Object f232729d = new Object();

    /* renamed from: e */
    private final Context f232730e;

    /* renamed from: f */
    private final C86129y f232731f;

    /* renamed from: g */
    private final C86342v f232732g;

    /* renamed from: h */
    private final C86338r f232733h;

    /* renamed from: i */
    private C86338r f232734i;

    /* renamed from: j */
    private final C68214a f232735j;

    /* renamed from: k */
    private boolean f232736k;

    /* renamed from: l */
    private ArrayList f232737l;

    public C86101aa(Context context, C86129y yVar, C86342v vVar, C68214a aVar, C84535at atVar) {
        this.f232730e = context;
        this.f232731f = yVar;
        this.f232735j = aVar;
        this.f232732g = vVar;
        C90476a aVar2 = C91018d.f254254a;
        this.f232733h = vVar.mo80095a(new File(context.getDir("shared_prefs", 0), "StartupSettings.bin"));
        this.f232728c = atVar.mo78243a();
    }

    /* renamed from: f */
    private final void m138444f() {
        if (!this.f232736k) {
            int i = this.f232733h.getInt("settings_version", -1);
            if (i < 20) {
                m138445g();
                this.f232731f.mo78215e(this.f232733h, this.f232734i, i, ((Integer) this.f232735j.mo27525b()).intValue());
            }
            this.f232736k = true;
        }
    }

    /* renamed from: g */
    private final void m138445g() {
        if (this.f232734i == null) {
            Context context = this.f232730e;
            C90476a aVar = C91018d.f254254a;
            this.f232734i = this.f232732g.mo80095a(new File(context.getDir("shared_prefs", 0), "SearchSettings.bin"));
            ArrayList arrayList = this.f232737l;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    this.f232734i.registerOnSharedPreferenceChangeListener((SharedPreferences.OnSharedPreferenceChangeListener) arrayList.get(i));
                }
                this.f232737l = null;
            }
        }
    }

    /* renamed from: a */
    public final C86338r mo79722a() {
        C86338r rVar;
        synchronized (this.f232729d) {
            if (this.f232734i == null) {
                if (!this.f232736k) {
                    m138444f();
                }
                m138445g();
            }
            rVar = this.f232734i;
        }
        return rVar;
    }

    /* renamed from: b */
    public final C86338r mo79723b() {
        C86338r rVar;
        synchronized (this.f232729d) {
            if (!this.f232736k) {
                m138444f();
            }
            rVar = this.f232733h;
        }
        return rVar;
    }

    /* renamed from: c */
    public final void mo79724c(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        synchronized (this.f232729d) {
            mo79723b().registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
            C86338r rVar = this.f232734i;
            if (rVar != null) {
                rVar.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
            } else {
                if (this.f232737l == null) {
                    this.f232737l = new ArrayList();
                }
                this.f232737l.add(onSharedPreferenceChangeListener);
            }
        }
    }

    /* renamed from: d */
    public final void mo79725d(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        synchronized (this.f232729d) {
            mo79723b().unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
            C86338r rVar = this.f232734i;
            if (rVar != null) {
                rVar.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
            } else {
                ArrayList arrayList = this.f232737l;
                if (arrayList != null) {
                    arrayList.remove(onSharedPreferenceChangeListener);
                }
            }
        }
    }

    /* renamed from: e */
    public final boolean mo79726e(String str) {
        return "SearchSettings".equals(str);
    }
}
