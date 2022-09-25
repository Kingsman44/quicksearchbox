package com.google.android.libraries.elements.p1714d.p1715a;

import com.google.android.libraries.elements.interfaces.DataSourceListener;
import java.util.ArrayList;
import java.util.List;
import p5488io.grpc.Status;

/* renamed from: com.google.android.libraries.elements.d.a.e */
/* compiled from: PG */
public final class C20780e extends C20779d {

    /* renamed from: a */
    private final List f58133a = new ArrayList();

    /* renamed from: a */
    public final void mo25867a(DataSourceListener dataSourceListener) {
        this.f58133a.add(dataSourceListener);
    }

    /* renamed from: b */
    public final void mo25868b() {
        this.f58133a.clear();
    }

    public final Status onDataChanged() {
        for (DataSourceListener onDataChanged : this.f58133a) {
            onDataChanged.onDataChanged();
        }
        return Status.f186902OK;
    }

    public final Status onError(Status status) {
        for (DataSourceListener onError : this.f58133a) {
            onError.onError(status);
        }
        return Status.f186902OK;
    }
}
