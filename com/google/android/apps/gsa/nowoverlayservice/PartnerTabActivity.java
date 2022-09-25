package com.google.android.apps.gsa.nowoverlayservice;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.gsa.monet.appcompat.AppCompatActivity;
import com.google.android.apps.gsa.shared.monet.p7070b.p7108y.C90300a;
import com.google.android.apps.gsa.sidekick.shared.monet.p7247c.C91816w;
import com.google.android.apps.gsa.sidekick.shared.monet.p7247c.C91817x;
import com.google.android.libraries.gsa.monet.shared.InitializationData;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;

/* compiled from: PG */
public class PartnerTabActivity extends AppCompatActivity {
    /* renamed from: w */
    public final InitializationData mo76765w() {
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            return null;
        }
        String string = extras.containsKey("partner_package_name") ? extras.getString("partner_package_name") : null;
        if (string == null) {
            return null;
        }
        C91816w wVar = (C91816w) C91817x.f256076d.createBuilder();
        wVar.copyOnWrite();
        C91817x xVar = (C91817x) wVar.instance;
        xVar.f256078a |= 1;
        xVar.f256079b = string;
        return new InitializationData(C90300a.f252221a, C23245b.m43556a((C91817x) wVar.build()), (Intent) null);
    }
}
