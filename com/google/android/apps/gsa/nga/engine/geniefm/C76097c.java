package com.google.android.apps.gsa.nga.engine.geniefm;

import com.google.android.apps.gsa.nga.engine.ar.cu;
import com.google.android.libraries.mdi.C29690f;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import java.io.FileNotFoundException;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.geniefm.c */
/* compiled from: PG */
public final /* synthetic */ class C76097c implements Function {

    /* renamed from: a */
    public final /* synthetic */ C76103i f210981a;

    public /* synthetic */ C76097c(C76103i iVar) {
        this.f210981a = iVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C76103i iVar = this.f210981a;
        C58495hd a = cu.a((C29690f) obj);
        if (!a.containsKey("i18n_resources.binarypb") || a.get("i18n_resources.binarypb") == null) {
            return C60856cj.m92899h(new FileNotFoundException("Could not find file with id: i18n_resources.binarypb"));
        }
        if (!a.containsKey("vertical_resources.binarypb") || a.get("vertical_resources.binarypb") == null) {
            return C60856cj.m92899h(new FileNotFoundException("Could not find file with id: vertical_resources.binarypb"));
        }
        if (!a.containsKey("patterns.binarypb") || a.get("patterns.binarypb") == null) {
            return C60856cj.m92899h(new FileNotFoundException("Could not find file with id: patterns.binarypb"));
        }
        if (!a.containsKey("rule_map.binarypb") || a.get("rule_map.binarypb") == null) {
            return C60856cj.m92899h(new FileNotFoundException("Could not find file with id: rule_map.binarypb"));
        }
        if (!a.containsKey("postag_counts_nga.binarypb") || a.get("postag_counts_nga.binarypb") == null) {
            ((C58970a) ((C58970a) C76103i.f210989a.mo56226d()).mo56372aa(3894)).mo56389s("Could not find file with id: %s.", "postag_counts_nga.binarypb");
        }
        return iVar.f210990b.mo28201a("[NGA] GenieFmResourcesManager.onResourceGroupUpdate", new C76100f(iVar, a));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
