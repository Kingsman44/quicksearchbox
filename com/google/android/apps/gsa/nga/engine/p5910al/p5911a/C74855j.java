package com.google.android.apps.gsa.nga.engine.p5910al.p5911a;

import android.hardware.Sensor;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6289k.p6290a.C80474b;
import com.google.android.libraries.p1730f.C21370a;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.nga.engine.al.a.j */
/* compiled from: PG */
public abstract class C74855j {

    /* renamed from: a */
    private static final long f209041a = Duration.ofDays(1).toMillis();

    /* renamed from: b */
    private static final long f209042b = Duration.ofHours(1).toMillis();

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.google.android.apps.gsa.nga.engine.al.a.j.d(com.google.android.libraries.f.a, android.hardware.SensorEvent):com.google.android.apps.gsa.nga.engine.al.a.j, dex: classes4.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    /* renamed from: d */
    static com.google.android.apps.gsa.nga.engine.p5910al.p5911a.C74855j m121031d(com.google.android.libraries.p1730f.C21370a r1, android.hardware.SensorEvent r2) {
        /*
        // Can't load method instructions: Load method exception: null in method: com.google.android.apps.gsa.nga.engine.al.a.j.d(com.google.android.libraries.f.a, android.hardware.SensorEvent):com.google.android.apps.gsa.nga.engine.al.a.j, dex: classes4.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.p5910al.p5911a.C74855j.m121031d(com.google.android.libraries.f.a, android.hardware.SensorEvent):com.google.android.apps.gsa.nga.engine.al.a.j");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.google.android.apps.gsa.nga.engine.al.a.j.e(com.google.android.libraries.f.a, android.hardware.TriggerEvent):com.google.android.apps.gsa.nga.engine.al.a.j, dex: classes4.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    /* renamed from: e */
    static com.google.android.apps.gsa.nga.engine.p5910al.p5911a.C74855j m121032e(com.google.android.libraries.p1730f.C21370a r1, android.hardware.TriggerEvent r2) {
        /*
        // Can't load method instructions: Load method exception: null in method: com.google.android.apps.gsa.nga.engine.al.a.j.e(com.google.android.libraries.f.a, android.hardware.TriggerEvent):com.google.android.apps.gsa.nga.engine.al.a.j, dex: classes4.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.p5910al.p5911a.C74855j.m121032e(com.google.android.libraries.f.a, android.hardware.TriggerEvent):com.google.android.apps.gsa.nga.engine.al.a.j");
    }

    /* renamed from: f */
    private static long m121033f(C21370a aVar, long j) {
        long b = aVar.mo26870b();
        long j2 = j / 1000000;
        if (Math.abs(b - j2) > f209041a) {
            j2 = aVar.mo26870b() - ((aVar.mo26873e() - j) / 1000000);
        }
        return (j2 > b || Math.abs(j2 - b) > f209042b) ? b : j2;
    }

    /* renamed from: g */
    private static C80474b m121034g(Sensor sensor) {
        int type = sensor.getType();
        if (type == 2) {
            return C80474b.MAGNETIC_FIELD;
        }
        if (type == 4) {
            return C80474b.GYROSCOPE;
        }
        if (type == 6) {
            return C80474b.PRESSURE;
        }
        if (type == 8) {
            return C80474b.PROXIMITY;
        }
        if (type == 15) {
            return C80474b.GAME_ROTATION_VECTOR;
        }
        if (type == 25) {
            return C80474b.PICK_UP;
        }
        if (type == 10) {
            return C80474b.LINEAR_ACCELERATION;
        }
        if (type != 11) {
            return C80474b.UNKNOWN;
        }
        return C80474b.ROTATION_VECTOR;
    }

    /* renamed from: a */
    public abstract long mo71248a();

    /* renamed from: b */
    public abstract C80474b mo71249b();

    /* renamed from: c */
    public abstract float[] mo71250c();
}
