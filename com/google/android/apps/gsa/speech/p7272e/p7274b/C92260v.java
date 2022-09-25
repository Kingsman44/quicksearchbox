package com.google.android.apps.gsa.speech.p7272e.p7274b;

import android.text.TextUtils;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4541l.C59337t;
import com.google.p395al.p408c.p414c.p416b.C8476as;
import com.google.protobuf.C62942bv;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.speech.e.b.v */
/* compiled from: PG */
public final class C92260v {

    /* renamed from: a */
    public static final C59071e f257237a = C59071e.m91332i("com.google.android.apps.gsa.speech.e.b.v");

    /* renamed from: b */
    public final List f257238b;

    /* renamed from: c */
    public final List f257239c = C58597ky.m90213d(C92249k.f257207h);

    /* renamed from: d */
    public final Map f257240d = new HashMap();

    /* renamed from: e */
    protected final List f257241e = C58597ky.m90213d(4);

    /* renamed from: f */
    protected final List f257242f = C58597ky.m90213d(C92249k.f257207h);

    /* renamed from: g */
    public String f257243g;

    /* renamed from: h */
    public C8476as f257244h;

    /* renamed from: i */
    public boolean f257245i;

    public C92260v(List list) {
        this.f257238b = list;
    }

    /* renamed from: a */
    public static C8476as m151491a(File file) {
        FileInputStream fileInputStream;
        IOException e;
        File file2 = new File(file, "metadata");
        FileInputStream fileInputStream2 = null;
        if (file2.exists()) {
            try {
                fileInputStream = new FileInputStream(file2);
                try {
                    C8476as asVar = (C8476as) C62942bv.parseFrom((C62942bv) C8476as.f29413p, (InputStream) fileInputStream);
                    C59337t.m92221a(fileInputStream);
                    return asVar;
                } catch (IOException e2) {
                    e = e2;
                    try {
                        ((C59052c) ((C59052c) ((C59052c) f257237a.mo56225c()).mo56382g(e)).mo56372aa(12325)).mo56386p("Could not parse metadata file.");
                        C59337t.m92221a(fileInputStream);
                        return null;
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream2 = fileInputStream;
                        C59337t.m92221a(fileInputStream2);
                        throw th;
                    }
                }
            } catch (IOException e3) {
                e = e3;
                fileInputStream = null;
                ((C59052c) ((C59052c) ((C59052c) f257237a.mo56225c()).mo56382g(e)).mo56372aa(12325)).mo56386p("Could not parse metadata file.");
                C59337t.m92221a(fileInputStream);
                return null;
            } catch (Throwable th2) {
                th = th2;
                C59337t.m92221a(fileInputStream2);
                throw th;
            }
        } else {
            ((C59052c) ((C59052c) f257237a.mo56225c()).mo56372aa(12324)).mo56386p("metadata file is not present");
            return null;
        }
    }

    /* renamed from: b */
    public final String mo86941b(C92252n nVar) {
        return (String) this.f257240d.get(nVar);
    }

    /* renamed from: c */
    public final String mo86942c(C92249k kVar, String str) {
        for (C92259u uVar : this.f257239c) {
            if (uVar.f257233a == kVar && TextUtils.equals(uVar.f257234b, str)) {
                return uVar.f257235c.getAbsolutePath();
            }
        }
        return null;
    }
}
