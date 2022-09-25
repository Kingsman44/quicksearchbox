package com.google.android.libraries.accountlinking.p10974a.p10975a;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.p031v4.app.Fragment;
import androidx.lifecycle.C2368bp;
import com.google.android.libraries.accountlinking.activity.C147388p;
import com.google.android.libraries.accountlinking.p10974a.C147366d;
import com.google.android.libraries.accountlinking.p10974a.C147372e;
import com.google.android.libraries.accountlinking.p10981d.C147421a;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.p3562ao.p3563a.p3567c.C45526d;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C63010eb;
import com.google.protobuf.MessageLite;
import com.google.protos.p5133r.p5134a.p5135a.p5136a.C65879c;
import com.google.protos.p5133r.p5134a.p5135a.p5136a.C65881e;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.libraries.accountlinking.a.a.b */
/* compiled from: PG */
public final class C147352b extends Fragment {

    /* renamed from: a */
    public static final C58495hd f397756a;

    /* renamed from: b */
    public static final C58495hd f397757b;

    /* renamed from: c */
    public C147372e f397758c;

    /* renamed from: d */
    public C147388p f397759d;

    /* renamed from: e */
    public String f397760e;

    /* renamed from: f */
    public boolean f397761f;

    /* renamed from: g */
    private C58485gu f397762g;

    /* renamed from: h */
    private C58485gu f397763h;

    /* renamed from: i */
    private String f397764i;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h("invalid_request", C147366d.m240280b(1));
        gzVar.mo55429h("unauthorized_client", C147366d.m240280b(17));
        gzVar.mo55429h("access_denied", C147366d.m240281c(2, 13));
        gzVar.mo55429h("unsupported_response_type", C147366d.m240280b(18));
        gzVar.mo55429h("invalid_scope", C147366d.m240280b(19));
        gzVar.mo55429h("server_error", C147366d.m240281c(2, 20));
        gzVar.mo55429h("temporarily_unavailable", C147366d.m240281c(2, 21));
        f397756a = gzVar.mo55427f(true);
        C58490gz gzVar2 = new C58490gz(4);
        gzVar2.mo55429h("invalid_request", C65879c.EVENT_APP_FLIP_INVALID_REQUEST);
        gzVar2.mo55429h("unauthorized_client", C65879c.EVENT_APP_FLIP_UNAUTHORIZED_CLIENT);
        gzVar2.mo55429h("access_denied", C65879c.EVENT_APP_FLIP_3P_CONSENT_REJECTED);
        gzVar2.mo55429h("unsupported_response_type", C65879c.EVENT_APP_FLIP_UNSUPPORTED_RESPONSE_TYPE);
        gzVar2.mo55429h("invalid_scope", C65879c.EVENT_APP_FLIP_INVALID_SCOPE);
        gzVar2.mo55429h("server_error", C65879c.EVENT_APP_FLIP_SERVER_ERROR);
        gzVar2.mo55429h("temporarily_unavailable", C65879c.EVENT_APP_FLIP_TEMPORARILY_UNAVAILABLE);
        f397757b = gzVar2.mo55427f(true);
    }

    public final void onCreate(Bundle bundle) {
        C58485gu guVar;
        super.onCreate(bundle);
        setRetainInstance(true);
        Bundle arguments = getArguments();
        arguments.getClass();
        try {
            C63010eb parserForType = C45526d.f118995f.getParserForType();
            C58480gp e = C58485gu.m89837e();
            byte[] byteArray = arguments.getByteArray("android_app_flip_list");
            if (byteArray == null) {
                guVar = e.mo55394f();
            } else {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray);
                while (true) {
                    MessageLite messageLite = (MessageLite) parserForType.mo59007f(byteArrayInputStream, C62921ba.m95368a());
                    if (messageLite == null) {
                        break;
                    }
                    e.mo55395g(messageLite);
                }
                guVar = e.mo55394f();
            }
            this.f397762g = guVar;
            String[] stringArray = arguments.getStringArray("SCOPE");
            stringArray.getClass();
            this.f397763h = C58485gu.m89844l(stringArray);
            String string = arguments.getString("google_client_id");
            string.getClass();
            this.f397764i = string;
            this.f397758c = (C147372e) new C2368bp(getActivity()).mo5770a(C147372e.class);
            C147388p pVar = (C147388p) new C2368bp(getActivity()).mo5770a(C147388p.class);
            this.f397759d = pVar;
            pVar.mo124148f(C65881e.STATE_APP_FLIP);
            Intent intent = (Intent) C147421a.m240339a(getContext().getPackageManager(), this.f397762g, this.f397763h, this.f397764i).mo56107c();
            Uri data = intent.getData();
            if ("android.intent.action.VIEW".equals(intent.getAction()) && data != null && data.getQueryParameterNames().contains("state")) {
                this.f397760e = data.getQueryParameter("state");
            }
            this.f397759d.mo124147e(C65879c.EVENT_APP_FLIP_3P_APP_SUPPORTED);
            this.f397761f = false;
            startActivityForResult(intent, 1);
        } catch (IOException e2) {
            throw new IllegalArgumentException("Cannot parse List<AndroidAppFlip> from argument bundle", e2);
        }
    }

    /* renamed from: a */
    public static C147352b m240260a(List list, Set set, String str) {
        list.getClass();
        set.getClass();
        str.getClass();
        C147352b bVar = new C147352b();
        Bundle bundle = new Bundle();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((MessageLite) it.next()).writeDelimitedTo(byteArrayOutputStream);
        }
        bundle.putByteArray("android_app_flip_list", byteArrayOutputStream.toByteArray());
        bundle.putStringArray("SCOPE", (String[]) set.toArray(new String[0]));
        bundle.putString("google_client_id", str);
        bVar.setArguments(bundle);
        return bVar;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C147366d dVar;
        if (i == 1) {
            if (i2 == -1) {
                if (intent != null) {
                    String stringExtra = intent.getStringExtra("AUTHORIZATION_CODE");
                    if (stringExtra == null) {
                        this.f397759d.mo124147e(C65879c.EVENT_APP_FLIP_3P_ERROR_RECOVERABLE);
                        this.f397759d.mo124151i(5, 6, 0, (String) null, (String) null);
                        dVar = C147366d.m240280b(15);
                    } else {
                        this.f397759d.mo124147e(C65879c.EVENT_APP_FLIP_FLOW_SUCCESS);
                        this.f397759d.mo124151i(3, 0, 0, (String) null, (String) null);
                        dVar = C147366d.m240279a(2, stringExtra);
                    }
                    this.f397758c.f397826a.mo5706i(dVar);
                    return;
                }
                i2 = -1;
            }
            if (i2 == 0) {
                this.f397759d.mo124147e(C65879c.EVENT_APP_FLIP_FLOW_CANCELED);
                this.f397759d.mo124151i(4, 0, 0, (String) null, (String) null);
                dVar = C147366d.m240280b(14);
            } else if (i2 != -2 || intent == null) {
                this.f397759d.mo124147e(C65879c.EVENT_APP_FLIP_3P_ERROR_RECOVERABLE);
                this.f397759d.mo124151i(5, 6, 0, (String) null, (String) null);
                dVar = C147366d.m240280b(15);
            } else {
                int intExtra = intent.getIntExtra("ERROR_TYPE", 1);
                int intExtra2 = intent.getIntExtra("ERROR_CODE", 15);
                String stringExtra2 = intent.getStringExtra("ERROR_DESCRIPTION");
                if (intExtra == 2) {
                    if (intExtra2 == 13) {
                        this.f397759d.mo124147e(C65879c.EVENT_APP_FLIP_3P_CONSENT_REJECTED);
                        this.f397759d.mo124151i(4, 4, 13, stringExtra2, (String) null);
                    } else {
                        this.f397759d.mo124147e(C65879c.EVENT_APP_FLIP_3P_ERROR_UNRECOVERABLE);
                        this.f397759d.mo124151i(5, 4, intExtra2, stringExtra2, (String) null);
                    }
                    dVar = C147366d.m240281c(2, intExtra2);
                } else if (intExtra == 3) {
                    this.f397759d.mo124147e(C65879c.EVENT_APP_FLIP_3P_ERROR_RECOVERABLE);
                    this.f397759d.mo124151i(5, 5, intExtra2, stringExtra2, (String) null);
                    dVar = C147366d.m240280b(intExtra2);
                } else {
                    this.f397759d.mo124147e(C65879c.EVENT_APP_FLIP_3P_ERROR_RECOVERABLE);
                    this.f397759d.mo124151i(5, 3, intExtra2, stringExtra2, (String) null);
                    dVar = C147366d.m240280b(intExtra2);
                }
            }
            this.f397758c.f397826a.mo5706i(dVar);
            return;
        }
        new Handler().postDelayed(new C147351a(this), 20);
    }
}
