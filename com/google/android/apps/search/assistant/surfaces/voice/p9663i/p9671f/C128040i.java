package com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9671f;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import androidx.p104d.p105a.C2164c;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60872cz;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.i.f.i */
/* compiled from: PG */
final class C128040i implements SensorEventListener {

    /* renamed from: a */
    final /* synthetic */ C128043l f352330a;

    /* renamed from: b */
    private final C128042k f352331b;

    /* renamed from: c */
    private final C128045n f352332c;

    /* renamed from: d */
    private final Sensor f352333d;

    /* renamed from: e */
    private final int f352334e;

    /* renamed from: f */
    private final C2164c f352335f;

    /* renamed from: g */
    private final ArrayList f352336g;

    /* renamed from: h */
    private boolean f352337h = false;

    /* renamed from: i */
    private C60872cz f352338i;

    public C128040i(C128043l lVar, C128042k kVar, C128045n nVar, Sensor sensor, int i, C2164c cVar) {
        this.f352330a = lVar;
        this.f352331b = kVar;
        this.f352332c = nVar;
        this.f352333d = sensor;
        this.f352334e = i;
        this.f352335f = cVar;
        this.f352336g = new ArrayList(i);
    }

    /* renamed from: c */
    private final synchronized void m209179c() {
        this.f352337h = false;
        this.f352330a.f352342c.unregisterListener(this);
        this.f352335f.mo5437b(C58485gu.m89842j(this.f352336g));
    }

    /* renamed from: a */
    public final synchronized void mo108326a() {
        if (this.f352337h) {
            m209179c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void mo108327b() {
        if (this.f352337h) {
            ((C58970a) ((C58970a) C128043l.f352340a.mo56225c()).mo56372aa(37763)).mo56389s("Already collecting %s", this.f352332c);
            return;
        }
        this.f352333d.getType();
        this.f352337h = true;
        this.f352330a.f352342c.registerListener(this, this.f352333d, this.f352331b.mo108310a());
        this.f352338i = this.f352330a.f352343d.mo29164d(new C128039h(this), this.f352331b.mo108312c().toMillis(), TimeUnit.MILLISECONDS);
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final synchronized void onSensorChanged(SensorEvent sensorEvent) {
        SensorEvent sensorEvent2 = sensorEvent;
        synchronized (this) {
            if (this.f352337h) {
                if (this.f352332c.f352350f == sensorEvent2.sensor.getType()) {
                    C21370a aVar = this.f352330a.f352341b;
                    long j = sensorEvent2.timestamp;
                    long j2 = C128046o.f352351a;
                    long b = aVar.mo26870b();
                    long j3 = j / 1000000;
                    if (Math.abs(b - j3) > C128046o.f352351a) {
                        j3 = aVar.mo26870b() - ((aVar.mo26873e() - j) / 1000000);
                    }
                    if (j3 <= b) {
                        if (Math.abs(j3 - b) <= C128046o.f352352b) {
                            b = j3;
                        }
                    }
                    this.f352336g.add(new C128035d(b, Arrays.copyOf(sensorEvent2.values, sensorEvent2.values.length)));
                    if (this.f352336g.size() == this.f352334e) {
                        C60872cz czVar = this.f352338i;
                        if (czVar != null) {
                            czVar.cancel(false);
                        }
                        m209179c();
                    }
                }
            }
        }
    }
}
