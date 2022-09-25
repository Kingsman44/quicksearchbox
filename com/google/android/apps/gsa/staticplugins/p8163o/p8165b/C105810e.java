package com.google.android.apps.gsa.staticplugins.p8163o.p8165b;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.p8924b.C119109a;
import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.p8924b.C119110b;
import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.p8924b.C119112d;
import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.p8924b.C119114f;
import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.p8924b.C119115g;
import com.google.android.libraries.p11016ak.p11022d.C147703a;
import com.google.android.libraries.p11016ak.p11022d.C147704b;
import com.google.android.libraries.p11016ak.p11022d.C147706d;
import com.google.android.libraries.p11016ak.p11022d.C147707e;
import com.google.android.libraries.p11016ak.p11022d.C147708f;
import com.google.android.libraries.p11016ak.p11022d.C147709g;
import com.google.android.libraries.p11016ak.p11022d.C147710h;
import com.google.android.libraries.p11016ak.p11022d.C147711i;
import com.google.android.libraries.p11016ak.p11022d.C147712j;
import com.google.android.libraries.p11016ak.p11022d.C147713k;
import com.google.android.libraries.p11016ak.p11022d.C147714l;
import com.google.android.libraries.p11016ak.p11022d.C147715m;

/* renamed from: com.google.android.apps.gsa.staticplugins.o.b.e */
/* compiled from: PG */
public final class C105810e {
    /* renamed from: a */
    static int m176156a(Throwable th) {
        if ((th instanceof C119110b) || (th instanceof C147704b)) {
            return C89885b.READ_IT_PLAYBACK_ERROR_DEADLINE_EXCEEDED_VALUE;
        }
        if ((th instanceof C119112d) || (th instanceof C147707e)) {
            return C89885b.READ_IT_PLAYBACK_ERROR_NETWORK_ERROR_VALUE;
        }
        if ((th instanceof C119114f) || (th instanceof C147711i)) {
            return C89885b.READ_IT_PLAYBACK_ERROR_CANCELLED_VALUE;
        }
        if ((th instanceof C119115g) || (th instanceof C147713k)) {
            return C89885b.READ_IT_PLAYBACK_ERROR_INTERNAL_ERROR_VALUE;
        }
        if ((th instanceof C119109a) || (th instanceof C147703a)) {
            return C89885b.READ_IT_PLAYBACK_ERROR_BAD_REQUEST_VALUE;
        }
        if (th instanceof C147714l) {
            return C89885b.READ_IT_PLAYBACK_ERROR_UNAUTHENTICATED_VALUE;
        }
        if (th instanceof C147712j) {
            return C89885b.READ_IT_PLAYBACK_ERROR_RESOURCE_EXHAUSTED_VALUE;
        }
        if (th instanceof C147709g) {
            return C89885b.READ_IT_PLAYBACK_ERROR_PERMISSION_DENIED_VALUE;
        }
        if (th instanceof C147710h) {
            return C89885b.READ_IT_PLAYBACK_ERROR_REQUEST_ABORTED_VALUE;
        }
        if (th instanceof C147708f) {
            return C89885b.READ_IT_PLAYBACK_ERROR_OUT_OF_RANGE_VALUE;
        }
        if (th instanceof C147706d) {
            return C89885b.READ_IT_PLAYBACK_ERROR_FAILED_PRECONDITION_VALUE;
        }
        return th instanceof C147715m ? C89885b.READ_IT_PLAYBACK_ERROR_UNKNOWN_VALUE : C89885b.READ_IT_PLAYBACK_ERROR_VALUE;
    }
}
