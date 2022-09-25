package androidx.appsearch.p050d;

import android.app.appsearch.AppSearchSchema;
import android.app.appsearch.AppSearchSession;
import android.app.appsearch.GenericDocument;
import android.app.appsearch.PackageIdentifier;
import android.app.appsearch.PutDocumentsRequest;
import android.app.appsearch.SetSchemaRequest;
import androidx.appsearch.p047a.C0831ad;
import androidx.appsearch.p047a.C0833af;
import androidx.appsearch.p047a.C0841f;
import androidx.appsearch.p047a.C0844i;
import androidx.appsearch.p047a.C0846k;
import androidx.appsearch.p047a.C0847l;
import androidx.appsearch.p047a.C0849n;
import androidx.appsearch.p047a.C0850o;
import androidx.appsearch.p047a.C0852q;
import androidx.appsearch.p047a.C0853r;
import androidx.appsearch.p047a.C0854s;
import androidx.appsearch.p047a.C0858w;
import androidx.appsearch.p047a.C0860y;
import androidx.appsearch.p047a.C0861z;
import androidx.appsearch.p050d.p051a.C0869a;
import androidx.appsearch.p050d.p051a.C0870b;
import androidx.appsearch.p050d.p052b.C0872a;
import androidx.core.p094f.C1888a;
import androidx.p104d.p105a.C2170i;
import com.google.common.util.concurrent.C60870cx;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import p3186j$.util.function.Consumer;
import p3186j$.util.function.Function;

/* renamed from: androidx.appsearch.d.i */
/* compiled from: PG */
final class C0879i implements C0854s {

    /* renamed from: a */
    private final AppSearchSession f2951a;

    /* renamed from: b */
    private final Executor f2952b;

    public C0879i(AppSearchSession appSearchSession, Executor executor) {
        appSearchSession.getClass();
        this.f2951a = appSearchSession;
        this.f2952b = executor;
    }

    /* renamed from: a */
    public final C60870cx mo3422a(C0831ad adVar) {
        C2170i iVar = new C2170i();
        AppSearchSession appSearchSession = this.f2951a;
        PutDocumentsRequest.Builder builder = new PutDocumentsRequest.Builder();
        for (C0858w a : Collections.unmodifiableList(adVar.f2793a)) {
            builder.addGenericDocuments(new GenericDocument[]{C0869a.m2755a(a)});
        }
        appSearchSession.put(builder.build(), this.f2952b, new C0872a(iVar, Function.CC.identity()));
        return iVar;
    }

    /* renamed from: b */
    public final C60870cx mo3423b(C0833af afVar) {
        AppSearchSchema.StringPropertyConfig stringPropertyConfig;
        C2170i iVar = new C2170i();
        AppSearchSession appSearchSession = this.f2951a;
        SetSchemaRequest.Builder builder = new SetSchemaRequest.Builder();
        for (C0853r rVar : Collections.unmodifiableSet(afVar.f2801a)) {
            AppSearchSchema[] appSearchSchemaArr = new AppSearchSchema[1];
            rVar.getClass();
            AppSearchSchema.Builder builder2 = new AppSearchSchema.Builder(rVar.mo3417a());
            List b = rVar.mo3418b();
            for (int i = 0; i < b.size(); i++) {
                C0850o oVar = (C0850o) b.get(i);
                oVar.getClass();
                if (oVar instanceof C0852q) {
                    C0852q qVar = (C0852q) oVar;
                    stringPropertyConfig = new AppSearchSchema.StringPropertyConfig.Builder(qVar.mo3406e()).setCardinality(qVar.mo3404c()).setIndexingType(qVar.mo3415a()).setTokenizerType(qVar.mo3416b()).build();
                } else if (oVar instanceof C0849n) {
                    stringPropertyConfig = new AppSearchSchema.LongPropertyConfig.Builder(oVar.mo3406e()).setCardinality(oVar.mo3404c()).build();
                } else if (oVar instanceof C0847l) {
                    stringPropertyConfig = new AppSearchSchema.DoublePropertyConfig.Builder(oVar.mo3406e()).setCardinality(oVar.mo3404c()).build();
                } else if (oVar instanceof C0841f) {
                    stringPropertyConfig = new AppSearchSchema.BooleanPropertyConfig.Builder(oVar.mo3406e()).setCardinality(oVar.mo3404c()).build();
                } else if (oVar instanceof C0844i) {
                    stringPropertyConfig = new AppSearchSchema.BytesPropertyConfig.Builder(oVar.mo3406e()).setCardinality(oVar.mo3404c()).build();
                } else if (oVar instanceof C0846k) {
                    C0846k kVar = (C0846k) oVar;
                    stringPropertyConfig = new AppSearchSchema.DocumentPropertyConfig.Builder(kVar.mo3406e(), kVar.mo3400a()).setCardinality(kVar.mo3404c()).setShouldIndexNestedProperties(kVar.mo3401b()).build();
                } else {
                    throw new IllegalArgumentException("Invalid dataType: " + oVar.mo3405d());
                }
                builder2.addProperty(stringPropertyConfig);
            }
            appSearchSchemaArr[0] = builder2.build();
            builder.addSchemas(appSearchSchemaArr);
        }
        for (String schemaTypeDisplayedBySystem : Collections.unmodifiableSet(afVar.f2802b)) {
            builder.setSchemaTypeDisplayedBySystem(schemaTypeDisplayedBySystem, false);
        }
        for (Map.Entry entry : afVar.f2803c.entrySet()) {
            for (C0861z zVar : (Set) entry.getValue()) {
                String string = zVar.f2852a.getString("packageName");
                string.getClass();
                byte[] byteArray = zVar.f2852a.getByteArray("sha256Certificate");
                byteArray.getClass();
                builder.setSchemaTypeVisibilityForPackage((String) entry.getKey(), true, new PackageIdentifier(string, byteArray));
            }
        }
        if (!C0833af.m2687a(afVar.f2804d).isEmpty()) {
            if (C1888a.m5150d()) {
                for (Map.Entry entry2 : C0833af.m2687a(afVar.f2804d).entrySet()) {
                    for (Set addRequiredPermissionsForSchemaTypeVisibility : (Set) entry2.getValue()) {
                        builder.addRequiredPermissionsForSchemaTypeVisibility((String) entry2.getKey(), addRequiredPermissionsForSchemaTypeVisibility);
                    }
                }
            } else {
                throw new UnsupportedOperationException("Set required permissions for schema type visibility are not supported with this backend/Android API level combination.");
            }
        }
        for (Map.Entry entry3 : Collections.unmodifiableMap(afVar.f2805e).entrySet()) {
            builder.setMigrator((String) entry3.getKey(), new C0870b((C0860y) entry3.getValue()));
        }
        SetSchemaRequest build = builder.setForceOverride(afVar.f2806f).setVersion(afVar.f2807g).build();
        Executor executor = this.f2952b;
        appSearchSession.setSchema(build, executor, executor, Consumer.Wrapper.convert(new C0877g(iVar)));
        return iVar;
    }

    public final void close() {
        this.f2951a.close();
    }
}
