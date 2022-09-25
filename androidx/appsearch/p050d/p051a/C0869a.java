package androidx.appsearch.p050d.p051a;

import android.app.appsearch.GenericDocument;
import android.os.Build;
import androidx.appsearch.p047a.C0857v;
import androidx.appsearch.p047a.C0858w;

/* renamed from: androidx.appsearch.d.a.a */
/* compiled from: PG */
public final class C0869a {
    /* renamed from: a */
    public static GenericDocument m2755a(C0858w wVar) {
        wVar.getClass();
        GenericDocument.Builder builder = new GenericDocument.Builder(wVar.mo3447h(), wVar.f2847b, wVar.f2848c);
        builder.setScore(wVar.mo3440a()).setTtlMillis(wVar.mo3442c()).setCreationTimestampMillis(wVar.f2849d);
        for (String str : wVar.mo3449i()) {
            Object f = wVar.mo3445f(str);
            if (f instanceof String[]) {
                builder.setPropertyString(str, (String[]) f);
            } else if (f instanceof long[]) {
                builder.setPropertyLong(str, (long[]) f);
            } else if (f instanceof double[]) {
                builder.setPropertyDouble(str, (double[]) f);
            } else if (f instanceof boolean[]) {
                builder.setPropertyBoolean(str, (boolean[]) f);
            } else if (f instanceof byte[][]) {
                byte[][] bArr = (byte[][]) f;
                if ((Build.VERSION.SDK_INT != 31 && Build.VERSION.SDK_INT != 32) || bArr.length != 0) {
                    builder.setPropertyBytes(str, bArr);
                }
            } else {
                if (f instanceof C0858w[]) {
                    C0858w[] wVarArr = (C0858w[]) f;
                    if ((Build.VERSION.SDK_INT != 31 && Build.VERSION.SDK_INT != 32) || wVarArr.length != 0) {
                        GenericDocument[] genericDocumentArr = new GenericDocument[wVarArr.length];
                        for (int i = 0; i < wVarArr.length; i++) {
                            genericDocumentArr[i] = m2755a(wVarArr[i]);
                        }
                        builder.setPropertyDocument(str, genericDocumentArr);
                    }
                } else {
                    throw new IllegalStateException(String.format("Property \"%s\" has unsupported value type %s", new Object[]{str, f.getClass().toString()}));
                }
            }
        }
        return builder.build();
    }

    /* renamed from: b */
    public static C0858w m2756b(GenericDocument genericDocument) {
        genericDocument.getClass();
        C0857v vVar = new C0857v(genericDocument.getNamespace(), genericDocument.getId(), genericDocument.getSchemaType());
        vVar.mo3430a(genericDocument.getScore()).mo3431b(genericDocument.getTtlMillis()).mo3434e(genericDocument.getCreationTimestampMillis());
        for (String str : genericDocument.getPropertyNames()) {
            Object property = genericDocument.getProperty(str);
            if (property instanceof String[]) {
                vVar.mo3439j(str, (String[]) property);
            } else if (property instanceof long[]) {
                vVar.mo3438i(str, (long[]) property);
            } else if (property instanceof double[]) {
                double[] dArr = (double[]) property;
                str.getClass();
                dArr.getClass();
                vVar.mo3433d();
                C0857v.m2720k(str);
                vVar.f2842a.putDoubleArray(str, dArr);
            } else if (property instanceof boolean[]) {
                vVar.mo3435f(str, (boolean[]) property);
            } else if (property instanceof byte[][]) {
                vVar.mo3436g(str, (byte[][]) property);
            } else {
                if (property instanceof GenericDocument[]) {
                    GenericDocument[] genericDocumentArr = (GenericDocument[]) property;
                    C0858w[] wVarArr = new C0858w[genericDocumentArr.length];
                    for (int i = 0; i < genericDocumentArr.length; i++) {
                        wVarArr[i] = m2756b(genericDocumentArr[i]);
                    }
                    vVar.mo3437h(str, wVarArr);
                } else {
                    throw new IllegalStateException(String.format("Property \"%s\" has unsupported value type %s", new Object[]{str, property.getClass().toString()}));
                }
            }
        }
        return vVar.mo3432c();
    }
}
