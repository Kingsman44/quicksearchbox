package com.google.android.libraries.search.location;

import android.app.PendingIntent;
import com.google.android.gms.awareness.fence.AwarenessFence;
import com.google.android.libraries.search.location.p3029a.p3031b.C38608a;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.search.location.d */
/* compiled from: PG */
public final /* synthetic */ class C38698d implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C38699e f102178a;

    /* renamed from: b */
    public final /* synthetic */ String f102179b;

    /* renamed from: c */
    public final /* synthetic */ String f102180c;

    /* renamed from: d */
    public final /* synthetic */ AwarenessFence f102181d;

    /* renamed from: e */
    public final /* synthetic */ PendingIntent f102182e;

    /* renamed from: f */
    public final /* synthetic */ C39226b f102183f;

    public /* synthetic */ C38698d(C38699e eVar, String str, String str2, AwarenessFence awarenessFence, PendingIntent pendingIntent, C39226b bVar) {
        this.f102178a = eVar;
        this.f102179b = str;
        this.f102180c = str2;
        this.f102181d = awarenessFence;
        this.f102182e = pendingIntent;
        this.f102183f = bVar;
    }

    public final C60870cx apply(Object obj) {
        C38699e eVar = this.f102178a;
        String str = this.f102179b;
        String str2 = this.f102180c;
        AwarenessFence awarenessFence = this.f102181d;
        PendingIntent pendingIntent = this.f102182e;
        C39226b bVar = this.f102183f;
        if (((Boolean) obj).booleanValue()) {
            return eVar.mo41560c(str, str2, awarenessFence, pendingIntent, bVar);
        }
        throw new C38608a();
    }
}
