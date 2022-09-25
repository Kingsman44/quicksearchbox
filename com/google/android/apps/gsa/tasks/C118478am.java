package com.google.android.apps.gsa.tasks;

import android.content.SharedPreferences;
import android.util.Base64;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62974ct;
import java.util.EnumMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.tasks.am */
/* compiled from: PG */
public final class C118478am {

    /* renamed from: a */
    public static final C59071e f328844a = C59071e.m91332i("com.google.android.apps.gsa.tasks.am");

    /* renamed from: b */
    static final long f328845b = TimeUnit.MINUTES.toMillis(5);

    /* renamed from: c */
    public final Object f328846c = new Object();

    /* renamed from: d */
    public int f328847d;

    /* renamed from: e */
    public final EnumMap f328848e;

    /* renamed from: f */
    public final C21370a f328849f;

    /* renamed from: g */
    public final SharedPreferences f328850g;

    public C118478am(C21370a aVar, SharedPreferences sharedPreferences) {
        this.f328849f = aVar;
        this.f328850g = sharedPreferences;
        EnumMap enumMap = new EnumMap(C118522by.class);
        String string = sharedPreferences.getString("background_tasks_deadlines", (String) null);
        if (string != null) {
            try {
                for (C118488aw awVar : ((C118489ax) C62942bv.parseFrom((C62942bv) C118489ax.f328877b, Base64.decode(string, 3))).f328879a) {
                    C118522by b = C118522by.m196758b(awVar.f328874b);
                    if (b == null) {
                        b = C118522by.UNKNOWN;
                    }
                    enumMap.put(b, Integer.valueOf(awVar.f328875c));
                }
            } catch (C62974ct | IllegalArgumentException unused) {
                ((C59052c) ((C59052c) f328844a.mo56225c()).mo56372aa(33979)).mo56386p("Background task deadline data was corrupted. Starting fresh.");
            }
        }
        this.f328848e = enumMap;
        int i = this.f328850g.getInt("background_tasks_last_generated_id", -1000000);
        this.f328847d = i;
        if (i > -1000000) {
            this.f328847d = -1000000;
        }
    }

    /* renamed from: a */
    public final void mo103714a() {
        C118486au auVar = (C118486au) C118489ax.f328877b.createBuilder();
        for (Map.Entry entry : this.f328848e.entrySet()) {
            C118487av avVar = (C118487av) C118488aw.f328871d.createBuilder();
            avVar.copyOnWrite();
            C118488aw awVar = (C118488aw) avVar.instance;
            awVar.f328874b = ((C118522by) entry.getKey()).f329106cj;
            awVar.f328873a |= 1;
            int intValue = ((Integer) entry.getValue()).intValue();
            avVar.copyOnWrite();
            C118488aw awVar2 = (C118488aw) avVar.instance;
            awVar2.f328873a |= 2;
            awVar2.f328875c = intValue;
            auVar.copyOnWrite();
            C118489ax axVar = (C118489ax) auVar.instance;
            C118488aw awVar3 = (C118488aw) avVar.build();
            awVar3.getClass();
            C62971cq cqVar = axVar.f328879a;
            if (!cqVar.mo58948c()) {
                axVar.f328879a = C62942bv.mutableCopy(cqVar);
            }
            axVar.f328879a.add(awVar3);
        }
        this.f328850g.edit().putString("background_tasks_deadlines", Base64.encodeToString(((C118489ax) auVar.build()).toByteArray(), 3)).apply();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo103715b(C118522by byVar) {
        synchronized (this.f328848e) {
            this.f328848e.remove(byVar);
            mo103714a();
        }
    }
}
