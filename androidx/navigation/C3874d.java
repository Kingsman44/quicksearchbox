package androidx.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.evernote.android.state.BuildConfig;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5482l.C69734n;

@C3865cf(mo8118a = "activity")
/* renamed from: androidx.navigation.d */
/* compiled from: PG */
public final class C3874d extends C3868ci {

    /* renamed from: b */
    private final Context f12442b;

    /* renamed from: c */
    private final Activity f12443c;

    public C3874d(Context context) {
        Object obj;
        C69664n.m101061g(context, "context");
        this.f12442b = context;
        Iterator a = C69734n.m101178d(context, C3859c.f12409a).mo5191a();
        while (true) {
            if (!a.hasNext()) {
                obj = null;
                break;
            }
            obj = a.next();
            if (((Context) obj) instanceof Activity) {
                break;
            }
        }
        this.f12443c = (Activity) obj;
    }

    /* renamed from: a */
    public final /* synthetic */ C3825ax mo8074a() {
        return new C3800a(this);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C3825ax mo8075b(C3825ax axVar, Bundle bundle, C3840bh bhVar, C3864ce ceVar) {
        Intent intent;
        int intExtra;
        C3800a aVar = (C3800a) axVar;
        Intent intent2 = aVar.f12268a;
        if (intent2 != null) {
            Intent intent3 = new Intent(intent2);
            if (bundle != null) {
                intent3.putExtras(bundle);
                String str = aVar.f12269b;
                if (!(str == null || str.length() == 0)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(str);
                    while (matcher.find()) {
                        String group = matcher.group(1);
                        if (bundle.containsKey(group)) {
                            matcher.appendReplacement(stringBuffer, BuildConfig.FLAVOR);
                            stringBuffer.append(Uri.encode(String.valueOf(bundle.get(group))));
                        } else {
                            throw new IllegalArgumentException("Could not find " + group + " in " + bundle + " to fill data pattern " + str);
                        }
                    }
                    matcher.appendTail(stringBuffer);
                    intent3.setData(Uri.parse(stringBuffer.toString()));
                }
            }
            if (!(ceVar instanceof C3828b)) {
                if (this.f12443c == null) {
                    intent3.addFlags(268435456);
                }
                if (bhVar != null && bhVar.f12390a) {
                    intent3.addFlags(536870912);
                }
                Activity activity = this.f12443c;
                int i = 0;
                if (!(activity == null || (intent = activity.getIntent()) == null || (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) == 0)) {
                    intent3.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
                }
                intent3.putExtra("android-support-navigation:ActivityNavigator:current", aVar.f12360i);
                Resources resources = this.f12442b.getResources();
                if (bhVar != null) {
                    int i2 = bhVar.f12397h;
                    int i3 = bhVar.f12398i;
                    if ((i2 <= 0 || !C69664n.m101066l(resources.getResourceTypeName(i2), "animator")) && (i3 <= 0 || !C69664n.m101066l(resources.getResourceTypeName(i3), "animator"))) {
                        intent3.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", i2);
                        intent3.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", i3);
                    } else {
                        Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring popEnter resource " + resources.getResourceName(i2) + " and popExit resource " + resources.getResourceName(i3) + " when launching " + aVar);
                    }
                }
                this.f12442b.startActivity(intent3);
                if (!(bhVar == null || this.f12443c == null)) {
                    int i4 = bhVar.f12395f;
                    int i5 = bhVar.f12396g;
                    if ((i4 > 0 && C69664n.m101066l(resources.getResourceTypeName(i4), "animator")) || (i5 > 0 && C69664n.m101066l(resources.getResourceTypeName(i5), "animator"))) {
                        Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring enter resource " + resources.getResourceName(i4) + " and exit resource " + resources.getResourceName(i5) + "when launching " + aVar);
                    } else if (i4 >= 0 || i5 >= 0) {
                        if (i4 < 0) {
                            i4 = 0;
                        }
                        if (i5 >= 0) {
                            i = i5;
                        }
                        this.f12443c.overridePendingTransition(i4, i);
                    }
                }
                return null;
            }
            C3828b bVar = (C3828b) ceVar;
            throw null;
        }
        throw new IllegalStateException("Destination " + aVar.f12360i + " does not have an Intent set.");
    }

    /* renamed from: c */
    public final boolean mo8076c() {
        Activity activity = this.f12443c;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }
}
