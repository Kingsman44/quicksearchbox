package com.google.android.apps.search.assistant.verticals.automation.routines.p10023b.p10024a;

import android.location.Address;
import com.google.common.p4522b.C58485gu;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.search.assistant.verticals.automation.routines.b.a.a */
/* compiled from: PG */
public final /* synthetic */ class C131848a implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C131849b f360074a;

    /* renamed from: b */
    public final /* synthetic */ String f360075b;

    /* renamed from: c */
    public final /* synthetic */ int f360076c;

    public /* synthetic */ C131848a(C131849b bVar, String str, int i) {
        this.f360074a = bVar;
        this.f360075b = str;
        this.f360076c = i;
    }

    public final Object call() {
        C131849b bVar = this.f360074a;
        List<Address> fromLocationName = bVar.f360078b.getFromLocationName(this.f360075b, this.f360076c);
        fromLocationName.getClass();
        return C58485gu.m89842j(fromLocationName);
    }
}
