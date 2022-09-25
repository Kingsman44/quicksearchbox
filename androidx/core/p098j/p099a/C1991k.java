package androidx.core.p098j.p099a;

import android.graphics.Rect;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.p094f.C1888a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.core.j.a.k */
/* compiled from: PG */
public final class C1991k {

    /* renamed from: a */
    public final AccessibilityNodeInfo f5921a;

    /* renamed from: b */
    public int f5922b = -1;

    /* renamed from: c */
    public int f5923c = -1;

    public C1991k(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f5921a = accessibilityNodeInfo;
    }

    /* renamed from: h */
    private final List m5334h(String str) {
        ArrayList<Integer> integerArrayList = this.f5921a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList arrayList = new ArrayList();
        this.f5921a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    /* renamed from: a */
    public final CharSequence mo5152a() {
        if (m5334h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty()) {
            return this.f5921a.getText();
        }
        List h = m5334h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List h2 = m5334h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List h3 = m5334h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List h4 = m5334h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f5921a.getText(), 0, this.f5921a.getText().length()));
        for (int i = 0; i < h.size(); i++) {
            spannableString.setSpan(new C1980a(((Integer) h4.get(i)).intValue(), this, this.f5921a.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) h.get(i)).intValue(), ((Integer) h2.get(i)).intValue(), ((Integer) h3.get(i)).intValue());
        }
        return spannableString;
    }

    /* renamed from: b */
    public final void mo5153b(C1988h hVar) {
        this.f5921a.addAction((AccessibilityNodeInfo.AccessibilityAction) hVar.f5915m);
    }

    /* renamed from: c */
    public final void mo5154c(Object obj) {
        this.f5921a.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) (obj == null ? null : ((C1989i) obj).f5919a));
    }

    /* renamed from: d */
    public final void mo5155d(Object obj) {
        this.f5921a.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) ((C1990j) obj).f5920a);
    }

    /* renamed from: e */
    public final void mo5156e(View view) {
        this.f5922b = -1;
        this.f5921a.setParent(view);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1991k)) {
            return false;
        }
        C1991k kVar = (C1991k) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f5921a;
        if (accessibilityNodeInfo == null) {
            if (kVar.f5921a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(kVar.f5921a)) {
            return false;
        }
        return this.f5923c == kVar.f5923c && this.f5922b == kVar.f5922b;
    }

    /* renamed from: f */
    public final void mo5158f(CharSequence charSequence) {
        this.f5921a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
    }

    /* renamed from: g */
    public final void mo5159g(C1988h hVar) {
        this.f5921a.removeAction((AccessibilityNodeInfo.AccessibilityAction) hVar.f5915m);
    }

    public final int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f5921a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public final String toString() {
        String str;
        List list;
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        this.f5921a.getBoundsInParent(rect);
        new StringBuilder("; boundsInParent: ").append(rect);
        sb.append("; boundsInParent: ".concat(rect.toString()));
        this.f5921a.getBoundsInScreen(rect);
        new StringBuilder("; boundsInScreen: ").append(rect);
        sb.append("; boundsInScreen: ".concat(rect.toString()));
        sb.append("; packageName: ");
        sb.append(this.f5921a.getPackageName());
        sb.append("; className: ");
        sb.append(this.f5921a.getClassName());
        sb.append("; text: ");
        sb.append(mo5152a());
        sb.append("; contentDescription: ");
        sb.append(this.f5921a.getContentDescription());
        sb.append("; viewId: ");
        sb.append(this.f5921a.getViewIdResourceName());
        sb.append("; uniqueId: ");
        if (C1888a.m5150d()) {
            str = this.f5921a.getUniqueId();
        } else {
            str = this.f5921a.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
        }
        sb.append(str);
        sb.append("; checkable: ");
        sb.append(this.f5921a.isCheckable());
        sb.append("; checked: ");
        sb.append(this.f5921a.isChecked());
        sb.append("; focusable: ");
        sb.append(this.f5921a.isFocusable());
        sb.append("; focused: ");
        sb.append(this.f5921a.isFocused());
        sb.append("; selected: ");
        sb.append(this.f5921a.isSelected());
        sb.append("; clickable: ");
        sb.append(this.f5921a.isClickable());
        sb.append("; longClickable: ");
        sb.append(this.f5921a.isLongClickable());
        sb.append("; enabled: ");
        sb.append(this.f5921a.isEnabled());
        sb.append("; password: ");
        sb.append(this.f5921a.isPassword());
        sb.append("; scrollable: " + this.f5921a.isScrollable());
        sb.append("; [");
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f5921a.getActionList();
        if (actionList != null) {
            list = new ArrayList();
            int size = actionList.size();
            for (int i = 0; i < size; i++) {
                list.add(new C1988h(actionList.get(i), 0, (CharSequence) null, (C1981aa) null, (Class) null));
            }
        } else {
            list = Collections.emptyList();
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            C1988h hVar = (C1988h) list.get(i2);
            int a = hVar.mo5148a();
            if (a == 1) {
                str2 = "ACTION_FOCUS";
            } else if (a != 2) {
                switch (a) {
                    case 4:
                        str2 = "ACTION_SELECT";
                        break;
                    case 8:
                        str2 = "ACTION_CLEAR_SELECTION";
                        break;
                    case 16:
                        str2 = "ACTION_CLICK";
                        break;
                    case 32:
                        str2 = "ACTION_LONG_CLICK";
                        break;
                    case 64:
                        str2 = "ACTION_ACCESSIBILITY_FOCUS";
                        break;
                    case 128:
                        str2 = "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                        break;
                    case 256:
                        str2 = "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                        break;
                    case 512:
                        str2 = "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                        break;
                    case 1024:
                        str2 = "ACTION_NEXT_HTML_ELEMENT";
                        break;
                    case 2048:
                        str2 = "ACTION_PREVIOUS_HTML_ELEMENT";
                        break;
                    case 4096:
                        str2 = "ACTION_SCROLL_FORWARD";
                        break;
                    case 8192:
                        str2 = "ACTION_SCROLL_BACKWARD";
                        break;
                    case 16384:
                        str2 = "ACTION_COPY";
                        break;
                    case 32768:
                        str2 = "ACTION_PASTE";
                        break;
                    case 65536:
                        str2 = "ACTION_CUT";
                        break;
                    case S3REQUEST_VALUE:
                        str2 = "ACTION_SET_SELECTION";
                        break;
                    case HTTP_VALUE:
                        str2 = "ACTION_EXPAND";
                        break;
                    case 524288:
                        str2 = "ACTION_COLLAPSE";
                        break;
                    case NOW_VALUE:
                        str2 = "ACTION_SET_TEXT";
                        break;
                    case 16908354:
                        str2 = "ACTION_MOVE_WINDOW";
                        break;
                    default:
                        switch (a) {
                            case 16908342:
                                str2 = "ACTION_SHOW_ON_SCREEN";
                                break;
                            case 16908343:
                                str2 = "ACTION_SCROLL_TO_POSITION";
                                break;
                            case 16908344:
                                str2 = "ACTION_SCROLL_UP";
                                break;
                            case 16908345:
                                str2 = "ACTION_SCROLL_LEFT";
                                break;
                            case 16908346:
                                str2 = "ACTION_SCROLL_DOWN";
                                break;
                            case 16908347:
                                str2 = "ACTION_SCROLL_RIGHT";
                                break;
                            case 16908348:
                                str2 = "ACTION_CONTEXT_CLICK";
                                break;
                            case 16908349:
                                str2 = "ACTION_SET_PROGRESS";
                                break;
                            default:
                                switch (a) {
                                    case 16908356:
                                        str2 = "ACTION_SHOW_TOOLTIP";
                                        break;
                                    case 16908357:
                                        str2 = "ACTION_HIDE_TOOLTIP";
                                        break;
                                    case 16908358:
                                        str2 = "ACTION_PAGE_UP";
                                        break;
                                    case 16908359:
                                        str2 = "ACTION_PAGE_DOWN";
                                        break;
                                    case 16908360:
                                        str2 = "ACTION_PAGE_LEFT";
                                        break;
                                    case 16908361:
                                        str2 = "ACTION_PAGE_RIGHT";
                                        break;
                                    case 16908362:
                                        str2 = "ACTION_PRESS_AND_HOLD";
                                        break;
                                    default:
                                        switch (a) {
                                            case 16908372:
                                                str2 = "ACTION_IME_ENTER";
                                                break;
                                            case 16908373:
                                                str2 = "ACTION_DRAG_START";
                                                break;
                                            case 16908374:
                                                str2 = "ACTION_DRAG_DROP";
                                                break;
                                            case 16908375:
                                                str2 = "ACTION_DRAG_CANCEL";
                                                break;
                                            default:
                                                str2 = "ACTION_UNKNOWN";
                                                break;
                                        }
                                }
                        }
                }
            } else {
                str2 = "ACTION_CLEAR_FOCUS";
            }
            if (str2.equals("ACTION_UNKNOWN") && hVar.mo5149b() != null) {
                str2 = hVar.mo5149b().toString();
            }
            sb.append(str2);
            if (i2 != list.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
