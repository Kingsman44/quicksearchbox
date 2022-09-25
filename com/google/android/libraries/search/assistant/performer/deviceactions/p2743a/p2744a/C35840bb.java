package com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a;

import androidx.slice.C4113l;
import androidx.slice.Slice;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.a.a.bb */
/* compiled from: PG */
final class C35840bb implements C4113l {

    /* renamed from: a */
    final /* synthetic */ Boolean[] f93918a;

    /* renamed from: b */
    final /* synthetic */ C35841bc f93919b;

    public C35840bb(C35841bc bcVar, Boolean[] boolArr) {
        this.f93919b = bcVar;
        this.f93918a = boolArr;
    }

    /* renamed from: a */
    public final void mo8625a(Slice slice) {
        if (slice != null) {
            ((C59052c) ((C59052c) C35841bc.f93920a.mo56224b()).mo56372aa(51965)).mo56389s("#onSliceUpdated: new slice is %s", slice);
            this.f93919b.f93925f = slice;
            this.f93918a[0] = true;
            return;
        }
        ((C59052c) ((C59052c) C35841bc.f93920a.mo56224b()).mo56372aa(51964)).mo56386p("#onSliceUpdated: new slice is null");
        this.f93919b.mo39863a();
        this.f93918a[0] = false;
    }
}
