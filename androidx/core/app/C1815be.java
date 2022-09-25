package androidx.core.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.core.content.C1845a;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.core.app.be */
/* compiled from: PG */
public final class C1815be implements Iterable {

    /* renamed from: a */
    public final ArrayList f5643a = new ArrayList();

    /* renamed from: b */
    public final Context f5644b;

    public C1815be(Context context) {
        this.f5644b = context;
    }

    /* renamed from: a */
    public final void mo5004a(Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            component = intent.resolveActivity(this.f5644b.getPackageManager());
        }
        if (component != null) {
            mo5005b(component);
        }
        this.f5643a.add(intent);
    }

    /* renamed from: b */
    public final void mo5005b(ComponentName componentName) {
        int size = this.f5643a.size();
        try {
            Intent b = C1829p.m5011b(this.f5644b, componentName);
            while (b != null) {
                this.f5643a.add(size, b);
                b = C1829p.m5011b(this.f5644b, b.getComponent());
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: c */
    public final void mo5006c() {
        if (!this.f5643a.isEmpty()) {
            Intent[] intentArr = (Intent[]) this.f5643a.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            C1845a.m5058a(this.f5644b, intentArr, (Bundle) null);
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }

    @Deprecated
    public final Iterator iterator() {
        return this.f5643a.iterator();
    }
}
