package com.google.android.apps.gsa.shared.p7127q.p7128a;

import com.google.android.apps.gsa.shared.logger.p7054d.C89884a;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7127q.C90456c;
import com.google.android.apps.gsa.shared.speech.p7139a.C90527s;
import com.google.android.apps.gsa.shared.speech.p7139a.C90528t;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.C59742e;
import com.google.common.p4552o.C59770f;
import java.util.ArrayList;
import java.util.List;
import p5488io.grpc.Status;

/* renamed from: com.google.android.apps.gsa.shared.q.a.b */
/* compiled from: PG */
public final class C90454b {

    /* renamed from: a */
    private static final C59071e f252685a = C59071e.m91332i("com.google.android.apps.gsa.shared.q.a.b");

    /* renamed from: a */
    public static int m147151a(int i, int i2) {
        Integer num;
        if (i2 != 211 || (num = (Integer) C89884a.f246252a.get(Integer.valueOf(i))) == null) {
            return 8;
        }
        return num.intValue();
    }

    /* renamed from: b */
    public static int m147152b(Status.Code code) {
        switch (code.ordinal()) {
            case 0:
                throw new IllegalArgumentException("status must be a failure case");
            case 1:
                return C89885b.GRPC_REQUEST_CANCELLED_VALUE;
            case 2:
                return C89885b.GRPC_REQUEST_UNKNOWN_VALUE;
            case 3:
                return C89885b.GRPC_REQUEST_INVALID_ARGUMENT_VALUE;
            case 4:
                return C89885b.GRPC_REQUEST_DEADLINE_EXCEEDED_VALUE;
            case 5:
                return C89885b.GRPC_REQUEST_NOT_FOUND_VALUE;
            case 6:
                return C89885b.GRPC_REQUEST_ALREADY_EXISTS_VALUE;
            case 7:
                return C89885b.GRPC_REQUEST_PERMISSION_DENIED_VALUE;
            case 8:
                return C89885b.GRPC_REQUEST_RESOURCE_EXHAUSTED_VALUE;
            case 9:
                return C89885b.GRPC_REQUEST_FAILED_PRECONDITION_VALUE;
            case 10:
                return C89885b.GRPC_REQUEST_ABORTED_VALUE;
            case 11:
                return C89885b.GRPC_REQUEST_OUT_OF_RANGE_VALUE;
            case 12:
                return C89885b.GRPC_REQUEST_UNIMPLEMENTED_VALUE;
            case 13:
                return C89885b.GRPC_REQUEST_INTERNAL_VALUE;
            case 14:
                return C89885b.GRPC_REQUEST_UNAVAILABLE_VALUE;
            case 15:
                return C89885b.GRPC_REQUEST_DATA_LOSS_VALUE;
            case 16:
                return C89885b.GRPC_REQUEST_UNAUTHENTICATED_VALUE;
            default:
                ((C59052c) ((C59052c) f252685a.mo56226d()).mo56372aa(10578)).mo56386p("Unrecognized gRPC status code.");
                return C89885b.GRPC_UNRECOGNIZED_STATUS_CODE_VALUE;
        }
    }

    /* renamed from: c */
    public static String m147153c(int i, int i2) {
        String str;
        if (i == 211) {
            str = "G";
        } else if (i == 212) {
            str = "H";
        } else if (i != 216) {
            ((C59052c) ((C59052c) f252685a.mo56225c()).mo56372aa(10579)).mo56387q("Unknown error type: %d", i);
            str = "U";
        } else {
            str = "S";
        }
        return str + i2;
    }

    /* renamed from: d */
    public static List m147154d(C90456c cVar) {
        ArrayList arrayList = new ArrayList();
        for (Throwable c = cVar.mo79845c(); c != null; c = c.getCause()) {
            if (c instanceof C90456c) {
                arrayList.add((C90456c) c);
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public static List m147155e(C90456c cVar) {
        List d = m147154d(cVar);
        ArrayList arrayList = new ArrayList(d.size());
        for (C90456c cVar2 : C58597ky.m90216g(d)) {
            C59742e eVar = (C59742e) C59770f.f161501d.createBuilder();
            int b = cVar2.mo79844b();
            eVar.copyOnWrite();
            C59770f fVar = (C59770f) eVar.instance;
            fVar.f161503a |= 1;
            fVar.f161504b = b;
            int a = cVar2.mo79843a();
            eVar.copyOnWrite();
            C59770f fVar2 = (C59770f) eVar.instance;
            fVar2.f161503a |= 2;
            fVar2.f161505c = a;
            arrayList.add((C59770f) eVar.build());
        }
        return arrayList;
    }

    /* renamed from: f */
    public static boolean m147156f(C90528t tVar) {
        return tVar != null && tVar.f253082c == 393244;
    }

    /* renamed from: g */
    public static boolean m147157g(C90528t tVar) {
        return (tVar instanceof C90527s) && tVar.f253081b == 1;
    }
}
