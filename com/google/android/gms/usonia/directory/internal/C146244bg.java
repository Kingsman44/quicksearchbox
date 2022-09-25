package com.google.android.gms.usonia.directory.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C143811de;
import com.google.android.gms.tasks.C146010af;
import java.util.Arrays;
import java.util.HashSet;

/* renamed from: com.google.android.gms.usonia.directory.internal.bg */
/* compiled from: PG */
final class C146244bg extends C146288x {

    /* renamed from: a */
    final /* synthetic */ C146010af f395102a;

    public C146244bg(C146010af afVar) {
        this.f395102a = afVar;
    }

    /* renamed from: e */
    public final void mo122808e(Status status, FetchAllPeerAddressesResult fetchAllPeerAddressesResult) {
        C143811de.m233724a(status, fetchAllPeerAddressesResult != null ? new HashSet(Arrays.asList(fetchAllPeerAddressesResult.f395026a)) : null, this.f395102a);
    }
}
