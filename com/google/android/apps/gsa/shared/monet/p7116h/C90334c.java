package com.google.android.apps.gsa.shared.monet.p7116h;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.h.k.b;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.libraries.gsa.monet.shared.C23129y;
import com.google.android.libraries.gsa.monet.shared.InitializationData;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4541l.C59315ac;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: com.google.android.apps.gsa.shared.monet.h.c */
/* compiled from: PG */
public final class C90334c {

    /* renamed from: a */
    public static final C59071e f252282a = C59071e.m91332i("com.google.android.apps.gsa.shared.monet.h.c");

    /* renamed from: a */
    public static Intent m146886a(String str, C23129y yVar, ProtoParcelable protoParcelable) {
        return b.b(str, yVar.f63478c, protoParcelable.mo28513b());
    }

    /* renamed from: b */
    public static InitializationData m146887b(Intent intent) {
        C58833ax c = b.c(intent);
        if (c.mo56113h()) {
            try {
                C58833ax d = b.d(intent);
                ProtoParcelable protoParcelable = d.mo56113h() ? new ProtoParcelable((byte[]) d.mo56107c()) : null;
                if (protoParcelable == null) {
                    return new InitializationData(new C23129y((String) c.mo56107c()), ProtoParcelable.f63423a, (Intent) null);
                }
                return new InitializationData(new C23129y((String) c.mo56107c()), protoParcelable, (Intent) null);
            } catch (IllegalArgumentException unused) {
                throw new C90333b("Failed to parse the base64-encoded input proto.");
            }
        } else {
            throw new C90333b(String.format("No feature type specified. Please encode the type in the Intent data: %s", new Object[]{intent.getData()}));
        }
    }

    /* renamed from: c */
    public static String m146888c(C23129y yVar) {
        return String.format("%s.binarypb", new Object[]{yVar.f63478c});
    }

    /* renamed from: d */
    public static void m146889d(Intent intent, C23129y yVar, ProtoParcelable protoParcelable) {
        b.f(intent, yVar.f63478c, protoParcelable.mo28513b());
    }

    /* renamed from: e */
    public static void m146890e(Context context, Intent intent, C23129y yVar) {
        C90476a aVar = C91018d.f254254a;
        byte[] bArr = null;
        try {
            bArr = new C59315ac(new File(context.getDir("monet_init_data", 0), m146888c(yVar))).mo56803a();
        } catch (FileNotFoundException unused) {
            C59104x b = f252282a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "MonetActivityIntentUtil");
            ((C59052c) ((C59052c) b).mo56372aa(10765)).mo56386p("Initialization data file not found");
        } catch (IOException e) {
            C59104x d = f252282a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "MonetActivityIntentUtil");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(10766)).mo56386p("Failed to read initialization data");
        }
        b.f(intent, yVar.f63478c, bArr);
    }
}
