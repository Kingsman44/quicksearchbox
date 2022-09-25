package com.google.android.gms.mdisync.internal;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C143707a;
import com.google.android.gms.common.api.C143840l;
import com.google.android.gms.common.api.C143841m;
import com.google.android.gms.common.api.C143846r;
import com.google.android.gms.common.api.C143847s;
import com.google.android.gms.common.api.internal.C143809dc;
import com.google.android.gms.mdisync.C145082c;
import com.google.android.gms.mdisync.C145083d;
import com.google.android.gms.mdisync.C145084e;
import com.google.android.gms.mdisync.CallerInfo;
import com.google.android.gms.mdisync.SyncOptions;
import com.google.android.gms.tasks.C146006ab;

/* renamed from: com.google.android.gms.mdisync.internal.g */
/* compiled from: PG */
public final class C145094g extends C143847s implements C145083d {

    /* renamed from: a */
    private static final C143840l f392156a;

    /* renamed from: b */
    private static final C143707a f392157b;

    /* renamed from: c */
    private static final C143841m f392158c;

    static {
        C143840l lVar = new C143840l();
        f392156a = lVar;
        C145092e eVar = new C145092e();
        f392157b = eVar;
        f392158c = new C143841m("MdiSync.API", eVar, lVar);
    }

    public C145094g(Context context, C145084e eVar) {
        super(context, (Activity) null, f392158c, eVar, C143846r.f389923a);
    }

    /* renamed from: a */
    public final C146006ab mo120596a(byte[] bArr, SyncOptions syncOptions, CallerInfo callerInfo) {
        Feature[] featureArr;
        SyncRequest syncRequest = new SyncRequest(1, bArr, syncOptions);
        C143809dc dcVar = new C143809dc();
        dcVar.f389860a = new C145091d(syncRequest, callerInfo);
        int i = syncRequest.f392151c - 1;
        if (i == 1 || i == 2 || i == 3) {
            featureArr = new Feature[]{C145082c.f392145b};
        } else {
            featureArr = i != 4 ? new Feature[0] : new Feature[]{C145082c.f392144a};
        }
        dcVar.f389862c = featureArr;
        dcVar.f389863d = 15902;
        return super.mo119290u(0, dcVar.mo119260a());
    }
}
