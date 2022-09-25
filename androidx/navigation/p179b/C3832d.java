package androidx.navigation.p179b;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.p033v7.p035b.p036a.C0407b;
import android.support.p033v7.widget.Toolbar;
import androidx.navigation.C3807af;
import androidx.navigation.C3823av;
import androidx.navigation.C3825ax;
import androidx.navigation.fragment.C3878b;
import androidx.p197u.C4195af;
import androidx.p197u.C4199aj;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p5462h.C69685i;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.navigation.b.d */
/* compiled from: PG */
public final class C3832d extends C3829a {

    /* renamed from: e */
    private final WeakReference f12369e;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C3832d(android.support.p033v7.widget.Toolbar r3, androidx.navigation.p179b.C3830b r4) {
        /*
            r2 = this;
            java.lang.String r0 = "toolbar"
            p5462h.p5473f.p5475b.C69664n.m101061g(r3, r0)
            android.content.Context r0 = r3.getContext()
            java.lang.String r1 = "toolbar.context"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r1)
            r2.<init>(r0, r4)
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference
            r4.<init>(r3)
            r2.f12369e = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.p179b.C3832d.<init>(android.support.v7.widget.Toolbar, androidx.navigation.b.b):void");
    }

    /* renamed from: a */
    public final void mo8090a(C3807af afVar, C3825ax axVar, Bundle bundle) {
        C69664n.m101061g(axVar, "destination");
        if (((Toolbar) this.f12369e.get()) != null) {
            C69664n.m101061g(axVar, "destination");
            if (!(axVar instanceof C3878b)) {
                CharSequence charSequence = axVar.f12357f;
                if (charSequence != null) {
                    StringBuffer stringBuffer = new StringBuffer();
                    Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(charSequence);
                    while (matcher.find()) {
                        String group = matcher.group(1);
                        if (bundle == null || !bundle.containsKey(group)) {
                            throw new IllegalArgumentException("Could not find \"" + group + "\" in " + bundle + " to fill label \"" + charSequence + '\"');
                        }
                        matcher.appendReplacement(stringBuffer, BuildConfig.FLAVOR);
                        stringBuffer.append(String.valueOf(bundle.get(group)));
                    }
                    matcher.appendTail(stringBuffer);
                    Toolbar toolbar = (Toolbar) this.f12369e.get();
                    if (toolbar != null) {
                        toolbar.mo2423x(stringBuffer);
                    }
                }
                Set set = this.f12364b;
                C69664n.m101061g(axVar, "<this>");
                Iterator a = C3823av.m11045c(axVar).mo5191a();
                do {
                    C69685i iVar = null;
                    if (!a.hasNext()) {
                        C0407b bVar = this.f12365c;
                        if (bVar != null) {
                            iVar = new C69685i(bVar, true);
                        }
                        if (iVar == null) {
                            C0407b bVar2 = new C0407b(this.f12363a);
                            this.f12365c = bVar2;
                            iVar = new C69685i(bVar2, false);
                        }
                        C0407b bVar3 = (C0407b) iVar.f186052a;
                        boolean booleanValue = ((Boolean) iVar.f186053b).booleanValue();
                        mo8091b(bVar3, R.string.nav_app_bar_navigate_up_description);
                        if (booleanValue) {
                            float f = bVar3.f1372a;
                            ValueAnimator valueAnimator = this.f12366d;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            this.f12366d = ObjectAnimator.ofFloat(bVar3, "progress", new float[]{f, 1.0f});
                            ValueAnimator valueAnimator2 = this.f12366d;
                            if (valueAnimator2 != null) {
                                ((ObjectAnimator) valueAnimator2).start();
                                return;
                            }
                            throw new NullPointerException("null cannot be cast to non-null type android.animation.ObjectAnimator");
                        }
                        bVar3.mo1371b(1.0f);
                        return;
                    }
                } while (!set.contains(Integer.valueOf(((C3825ax) a.next()).f12360i)));
                mo8091b((Drawable) null, 0);
                return;
            }
            return;
        }
        afVar.mo8054n(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo8091b(Drawable drawable, int i) {
        Toolbar toolbar = (Toolbar) this.f12369e.get();
        if (toolbar != null) {
            boolean z = false;
            if (drawable == null && toolbar.mo2391e() != null) {
                z = true;
            }
            toolbar.mo2418s(drawable);
            toolbar.mo2415p(i);
            if (z) {
                C4199aj.m12054b(toolbar, (C4195af) null);
            }
        }
    }
}
