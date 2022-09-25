package com.google.android.apps.search.googleapp.search.p10415i;

import com.google.common.base.C58839bc;
import com.google.common.p4526f.p4527a.C58974d;
import org.chromium.net.NetworkException;
import org.chromium.net.QuicException;

/* renamed from: com.google.android.apps.search.googleapp.search.i.e */
/* compiled from: PG */
public final /* synthetic */ class C137503e implements C58839bc {

    /* renamed from: a */
    public static final /* synthetic */ C137503e f373993a = new C137503e();

    private /* synthetic */ C137503e() {
    }

    /* renamed from: a */
    public final boolean mo5941a(Object obj) {
        Exception exc = (Exception) obj;
        C58974d dVar = C137508j.f374002a;
        if (exc instanceof C137509k) {
            int i = ((C137509k) exc).f374009a;
            C137511m mVar = C137511m.UNKNOWN;
            if (C137510l.m223397a(i) != C137511m.SERVER_ERROR || i == 503) {
                return false;
            }
            return true;
        } else if ((exc instanceof NetworkException) && ((NetworkException) exc).getCronetInternalErrorCode() != 0) {
            return !(exc instanceof QuicException) || ((QuicException) exc).getQuicDetailedErrorCode() != 0;
        }
        return false;
    }
}
