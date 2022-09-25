package com.google.android.apps.gsa.search.core.p6501ad;

import android.database.AbstractCursor;
import android.database.CursorIndexOutOfBoundsException;
import com.google.android.apps.gsa.shared.p6990an.C89235z;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.common.p4535g.C59203do;

/* renamed from: com.google.android.apps.gsa.search.core.ad.b */
/* compiled from: PG */
public final class C84415b extends AbstractCursor {

    /* renamed from: a */
    private static final String[] f229696a = {"_id", "suggest_text_1", "suggest_text_2", "suggest_text_2_url", "suggest_icon_1", "suggest_icon_2", "suggest_intent_action", "suggest_intent_data", "suggest_intent_extra_data", "suggest_intent_query", "suggest_format", "suggest_shortcut_id", "suggest_spinner_while_refreshing"};

    /* renamed from: b */
    private final C84414a f229697b;

    public C84415b(C84414a aVar) {
        this.f229697b = aVar;
    }

    public final String[] getColumnNames() {
        return f229696a;
    }

    public final int getCount() {
        return this.f229697b.f229693a.size();
    }

    public final double getDouble(int i) {
        try {
            String string = getString(i);
            if (string != null) {
                return Double.parseDouble(string);
            }
            return C59203do.f157270a;
        } catch (NumberFormatException unused) {
            return C59203do.f157270a;
        }
    }

    public final float getFloat(int i) {
        try {
            String string = getString(i);
            if (string != null) {
                return Float.parseFloat(string);
            }
            return 0.0f;
        } catch (NumberFormatException unused) {
            return 0.0f;
        }
    }

    public final int getInt(int i) {
        if (i == 0) {
            return getPosition();
        }
        try {
            String string = getString(i);
            if (string != null) {
                return Integer.parseInt(string);
            }
            return 0;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public final long getLong(int i) {
        try {
            String string = getString(i);
            if (string != null) {
                return Long.parseLong(string);
            }
            return 0;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public final short getShort(int i) {
        try {
            String string = getString(i);
            if (string != null) {
                return Short.parseShort(string);
            }
            return 0;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public final String getString(int i) {
        C84414a aVar = this.f229697b;
        Suggestion suggestion = (Suggestion) aVar.f229693a.get(getPosition());
        if (i < 13) {
            switch (i) {
                case 0:
                    return String.valueOf(getPosition());
                case 1:
                    CharSequence charSequence = suggestion.f108908i;
                    if (charSequence == null) {
                        return null;
                    }
                    return charSequence.toString();
                case 2:
                    return null;
                case 3:
                    return C89235z.m145146r(suggestion);
                case 4:
                    return C89235z.m73090J(suggestion);
                case 5:
                    return null;
                case 6:
                    return C89235z.m73091K(suggestion);
                case 7:
                    return C89235z.m73092L(suggestion);
                case 8:
                    return C89235z.m73093M(suggestion);
                case 9:
                    int i2 = C89235z.f241968a;
                    return suggestion.f108911l.getString("query");
                case 10:
                    return null;
                case 11:
                    return "_-1";
                case 12:
                    return "false";
                default:
                    throw new CursorIndexOutOfBoundsException("Requested column " + i + " of 13");
            }
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public final boolean isNull(int i) {
        return getString(i) == null;
    }
}
