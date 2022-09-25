package com.google.android.apps.gsa.nga.engine.understanding.p6238e;

import android.location.Location;
import com.google.android.apps.gsa.nga.engine.annotators.by;
import com.google.android.apps.gsa.nga.engine.annotators.bz;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.e.ah */
/* compiled from: PG */
public final /* synthetic */ class C79083ah implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C79083ah f217441a = new C79083ah();

    private /* synthetic */ C79083ah() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Location location = (Location) obj;
        by createBuilder = bz.e.createBuilder();
        double latitude = location.getLatitude();
        createBuilder.copyOnWrite();
        bz bzVar = createBuilder.instance;
        bzVar.a |= 1;
        bzVar.b = latitude;
        double longitude = location.getLongitude();
        createBuilder.copyOnWrite();
        bz bzVar2 = createBuilder.instance;
        bzVar2.a |= 2;
        bzVar2.c = longitude;
        float accuracy = location.getAccuracy();
        createBuilder.copyOnWrite();
        bz bzVar3 = createBuilder.instance;
        bzVar3.a |= 4;
        bzVar3.d = (double) accuracy;
        return createBuilder.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
